class Employee:
    def __init__(self, first_name, last_name, year_salary):
        self.first_name=first_name
        self.last_name=last_name
        self.year_salary=year_salary
    
    def give_raise(self, give_raise=5_000):
        self.year_salary += give_raise
        