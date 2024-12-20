import pygame

class Dragon:
    def __init__(self,st_game):
        self.screen=st_game.screen
        self.screen_rect=st_game.screen.get_rect()
        self.settings=st_game.settings
        
        self.image=pygame.image.load("C:\\Users\\88690\\Documents\\python2023-2024\\vscode2024\\practice2402\\alien_invasion\\image\\alien.bmp")
        self.image = pygame.transform.scale(self.image, (150, 150))  
        
        self.rect=self.image.get_rect()
        self.rect.center=self.screen_rect.center
        self.x=float(self.rect.x)
        self.y=float(self.rect.y)
        
        self.moving_right=False
        self.moving_left=False
        self.moving_up=False
        self.moving_down=False
        
    def update(self):
        if self.moving_right and self.rect.right < self.screen_rect.right:
            self.x += self.settings.dragon_speed
        if self.moving_left and self.rect.left > 0:
            self.x -= self.settings.dragon_speed
        self.rect.x=self.x 

        if self.moving_up and self.rect.top > 0:
            self.y -= self.settings.dragon_speed
        if self.moving_down and self.rect.bottom < self.screen_rect.bottom:
            self.y += self.settings.dragon_speed
        self.rect.y = self.y

        
    def blitme(self):
        self.screen.blit(self.image,self.rect)