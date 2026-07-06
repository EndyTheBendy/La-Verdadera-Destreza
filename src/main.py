from fencer import *
import random

idiot = Fencer("The Idiot")
other = Fencer("The Other")

while True:	
			
	print(f"{idiot.name} {idiot.action}.")
	print(f"{other.name} {other.action}.")
	
	random.choice(idiot.available_actions)(idiot)
	random.choice(other.available_actions)(other)
	
	command = input()
	
	if command == "abort":
		break