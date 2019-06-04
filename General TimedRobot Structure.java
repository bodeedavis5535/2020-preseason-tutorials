
package frc.robot;

/* Imports go here, imports are a bit of code which FIRST made in order to make things easier for programmers during competitions.
Instead of having to often use advanced mathematics and such in order to do more advanced operations. That is why not that many teams have
swirve drive, it is not "native" to frc and teams need to use trigg and calc in order to make it plausible for them to make it. */



public class Robot extends TimedRobot {

  @Override
  public void robotInit() {
    /* This is where you will declare a part that you are programming.
    For example, you want to program a motor controller that will control a motor,
    so you tell it where it is on the roborio or in the can line in order for it to determine which 
    motor it will effect. 
    Stuff put in here will be activated when the robot turns on*/
  }

  @Override
  public void robotPeriodic() {
    /* In here, you can control different parts of the robot without having to reuse them in every stage of the match.
    This is actually a new feature and would have been really nice to have last year, as we had a lot of functions that 
    occured in both the teleop period and the autonomous period. */
  }

  @Override
  public void autonomousInit() {
    /* In here, you put code for things that you want to happen as soon as the autonomous period of a match to start,
    for example, you can tell it to automatically turn on the compressor when you the autonomous period starts. */
  }


  @Override
  public void autonomousPeriodic() {
    /* This is where you put programs that you want to occur during the duration of the autonomous period of a match. This is 
    generally where you put the controls if you have them or where you tell the robot which actions to take. */
  }


  @Override
  public void teleopPeriodic() {
    /* This is where you put programs that you want to occur during the duration of the teleop period of a match. This is where the 
    majority of human or operator controls will come in. */
  }


  @Override
  public void testPeriodic() {
    //You do not need to worry about this too much.
  }

  /* You can create a new class by typing public void _________() {}. you can call upon the functions in it later by typing the name.name of function*/
  public void GeneralCommands(){
    // You can Create Comments by using to slashes
    /* or by using a slash and an asterix.
    this form is also multi-line, so you will need to end it by typing */
  }
}
