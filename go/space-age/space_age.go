// Space-age program for exercism side exercise
package space

type Planet string

var planet_info = []struct {
	name Planet
	relative_orbital_year float64
}{
	{
		name: "Mercury",
		relative_orbital_year: 0.2408467,
	},
	{
		name: "Venus",
		relative_orbital_year: 0.61519726,
	},
	{
		name: "Mars",
		relative_orbital_year: 1.8808158,
	},
	{
		name: "Earth",
		relative_orbital_year: 1,
	},
	{
		name: "Jupiter",
		relative_orbital_year: 11.862615,
	},
	{
		name: "Saturn",
		relative_orbital_year: 29.447498,
	},
	{
		name: "Uranus",
		relative_orbital_year: 84.016846,
	},
	{
		name: "Neptune",
		relative_orbital_year: 164.79132,
	},
}

// Age takes seconds from birth, and planet name.
// Returns the age in that planet relative to earth years
// In case the planet name is wrong returns 0
func Age(seconds float64, planet_name Planet) float64 {
	const earth_seconds = 31557600
	for _, p := range planet_info {
		if planet_name == p.name {
			ryear := p.relative_orbital_year * earth_seconds
			return seconds/ryear
		}
	}
	return 0
}
