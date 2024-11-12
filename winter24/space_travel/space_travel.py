import sys
import pygame
from settings import Settings
from dragon import Dragon
from fireball import FireBall

class SpaceTravel:
    def __init__(self):
        pygame.init()
        self.settings=Settings()
        
        self.screen=pygame.display.set_mode((self.settings.screen_width, self.settings.screen_height))
        pygame.display.set_caption("Space Travel")        
        self.dragon=Dragon(self)
        
        self.fires=pygame.sprite.Group()
            
    def run_game(self):
        while True:
            self._check_events()
            self.dragon.update()
            self.fires.update()
            
            for fire in self.fires.copy():
                if fire.rect.right <= 0:
                    self.fires.remove(fire)
                
            self._update_screen()
            
            
    def _check_events(self):
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                sys.exit()
            elif event.type == pygame.KEYDOWN:
                self._check_keydown_events(event)
            elif event.type == pygame.KEYUP:
                self._check_keyup_events(event)
    
    def _check_keydown_events(self,event):
        if event.key == pygame.K_RIGHT:
            self.dragon.moving_right=True
        elif event.key == pygame.K_LEFT:
            self.dragon.moving_left=True
        elif event.key == pygame.K_UP:
            self.dragon.moving_up=True
        elif event.key == pygame.K_DOWN:
            self.dragon.moving_down=True
        elif event.key == pygame.K_q:
            sys.exit()
        elif event.key == pygame.K_SPACE:
            self._shoot_fire()
        
        
    def _check_keyup_events(self,event):
        if event.key == pygame.K_RIGHT:
            self.dragon.moving_right=False
        elif event.key == pygame.K_LEFT:
            self.dragon.moving_left=False
        elif event.key == pygame.K_UP:
            self.dragon.moving_up=False
        elif event.key == pygame.K_DOWN:
            self.dragon.moving_down=False
    
    def _shoot_fire(self):
        if len(self.fires) < self.settings.fire_allowed:
            new_fireball=FireBall(self)
            self.fires.add(new_fireball)
            
            
    def _update_screen(self):
        self.screen.fill(self.settings.bg_color)
        self.dragon.blitme()
        for fire in self.fires.sprites():
            fire.draw_fire()
        pygame.display.flip()
        
if __name__ =="__main__":
    st=SpaceTravel()
    st.run_game()            
        
        