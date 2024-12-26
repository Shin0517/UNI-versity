class Settings:
    def __init__(self):
        """
        game screen settings
        """
        self.screen_width=1200
        self.screen_height=700
        self.bg_color=(200,200,200)
        self.bullets_allowed=3
        
        """
        ship speed setting
        """
        self.ship_speed=1.5
        self.ship_limit=3        
        """
        alien speed settings
        """
        self.alien_speed=1.0
        self.fleet_drop_speed=10
        self.fleet_direction=1
        
        """
        bullet settings
        """
        self.bullet_width=3
        self.bullet_height=15
        self.bullet_color=(255,60,60)
        self.bullet_speed=1.5       