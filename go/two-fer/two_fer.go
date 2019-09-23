// Package twofer returns a string based on user input
package twofer

import (
	"strings"
)

// ShareWith takes either a name and returns the string embedded with the name
// Or returns a default
func ShareWith(name string) string {
	twofer := "One for you, one for me."
	if len(name) > 0 {
		twofer = strings.Replace(twofer, "you", name, 1)
	}
	return twofer
}
