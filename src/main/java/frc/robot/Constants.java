// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class Intake {
        public static final int intake_motor = 21; //neo motor port should be changed
        public static final double intake_speed = 0.8;
        public static final int soleinoid_one_forward = 2;
        public static final int soleinoid_one_backward = 3;
        public static final int soleinoid_two_forward = 5;
        public static final int soleinoid_two_backward = 4;
    }
}
