import pygame
from pygame.sprite import Sprite

class FireBall(Sprite):
    def __init__(self, ts_game):
        super().__init__()
        self.screen=ts_game.screen
        self.settings=ts_game.settings
        self.color=self.settings.fire_color
        
        self.rect=pygame.Rect(0, 0, self.settings.fire_width, self.settings.fire_height)
        self.rect.midright=ts_game.dragon.rect.midright
        
        self.x=float(self.rect.x)
        
    def update(self):
        self.x -= self.settings.fire_speed
        self.rect.x=self.x
        
    def draw_fire(self):
        pygame.draw.rect(self.screen, self.color, self.rect)