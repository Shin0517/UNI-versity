def get_complete_location(city, country, population=""):
    if population:
        complete_location=(f"{city.title()}, {country.title()} -- population {population}")
    else:
        complete_location=(f"{city.title()}, {country.title()}")
    return complete_location