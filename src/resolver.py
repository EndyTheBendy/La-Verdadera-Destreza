from fencer import *
import random

class Flag(Enum):
    CONTINUE = 0
    END = 1

def resolve_turn(left: Fencer, right: Fencer):
    
    # resolving status
    if left.status == Status.DEAD and right.status == Status.DEAD:
        print(f"A double hit! An honourable draw --- but a draw isn't victory!")
        return Flag.END
    elif left.status == Status.DEAD:
        print(f"{left.name} has bled! The duel is over.\n{right.name} wins!")
        return Flag.END
    elif right.status == Status.DEAD:
        print(f"{right.name} has bled! The duel is over.\n{left.name} wins!")
        return Flag.END
    

    # resolving distance
    observer = random.choice([left, right]) # random things for flavour text.
    target = left if observer is right else right
    flavour_rng = random.randint(1,6)
    match Fencer.range:
        case Range.GRAB:
            print("The fighters stand at arms' reach.")
            if flavour_rng == 1:
                print(f"{observer.name} can make out the beads of sweat on {target.name}'s forehead...")

        case Range.CLOSE:
            print("The fighters are in range.")
            if flavour_rng == 1 or flavour_rng == 3:
                print("Steel scrapes and grinds as blades meet and bind...")
            if flavour_rng == 1 or flavour_rng == 2:
                print(f"{observer.name}'s hand tenses around the rapier's grip...")

        case Range.MID:
            print("The fighters stand apart.")
            match flavour_rng:
                case 1:
                    print(f"{observer.name}'s legs shift their weight amongst each other...")
                case 2:
                    print("Tips touch sparingly, the clinks breaking otherwise undisturbed silence...")
                case 3:
                    print("Movements slow and halt as the duelists engage in a game of minds...")
                case _:
                    pass

        case Range.FAR:
            print("The fighters size each other up from afar.")
            match flavour_rng:
                case 1:
                    print(f"{observer.name} taunts the opponent.")
                    if random.choice([True, False]):
                        print(f"Something {target.name} dares not leave unanswered!")
                case 2:
                    print(f"{observer.name}'s rapier twirls in a flourish, demonstrating the fencer's skill... or perhaps impatience.")
                case 3:
                    print(f"{observer.name} swings at the ground, scraping the stones to create a shower of sparks!")
                case _:
                    pass