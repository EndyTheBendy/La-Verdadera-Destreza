from enum import Enum

class Action(Enum):
	NEUTRAL = 0
	THRUST = 1
	VOID = 2
	PARRY = 3
	APPROACH = 4
	RETREAT = 5
	GRAPPLE = 6
	
class Range(Enum):
	GRAB = 0
	CLOSE = 1
	MID = 2
	FAR = 3

class Status(Enum):
	NORMAL = 0
	STAGGERED = 1
	DEAD = 2

class Fencer:
	# a fencer :|
	range = Range.MID

	def __init__(self, name):
		self.status = Status.NORMAL
		self.action = Action.NEUTRAL
		self.name = name

		self.available_actions = [
				Fencer.thrust,
				Fencer.void,
				Fencer.parry,
				Fencer.neutral,
				Fencer.approach,
				Fencer.retreat,
				Fencer.grapple
			]
	
	# -------------------------------------------------------- #	
    # ACTION FUNCTIONS
	def thrust(self):
		self.action = Action.THRUST
	
	def void(self):
		self.action = Action.VOID
	
	def parry(self):
		self.action = Action.PARRY
	
	def neutral(self):
		self.action = Action.NEUTRAL
	
	def approach(self):
		self.action = Action.APPROACH
	
	def retreat(self):
		self.action = Action.RETREAT

	def grapple(self):
		self.action = Action.GRAPPLE
	# ACTION FUNCTIONS
	# -------------------------------------------------------- #
	# STATUS FUNCTIONS
	def die(self):
		self.status = Status.DEAD
	
	def revive(self):
		self.status = Status.NORMAL
	
	def stagger(self):
		self.status = Status.STAGGERED
	# STATUS FUNCTIONS
	# -------------------------------------------------------- #
    # MOVEMENT FUNCTIONS
	def _move_close(self):
		if Fencer.range != Range.GRAB:
			Fencer.range -= 1

	def _move_away(self):
		if Fencer.range != Range.FAR:
			Fencer.range += 1
	
	def _set_mid(self):
		Fencer.range = Range.MID
    # MOVEMENT FUNCTIONS