/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.templates.commands.ResetClimber;

/**
 *
 * @author Developer
 */
public class Climber extends Subsystem{
    
    //Jaguar leftJaguar;
    //Jaguar rightJaguar;
    Jaguar jaguar;
    public DigitalInput leftTopSwitch;
    public DigitalInput leftBottomSwitch;
    public DigitalInput rightTopSwitch;
    public DigitalInput rightBottomSwitch;
    boolean direction; //false is downwards; true is upwards
    
    public void initDefaultCommand(){
        setDefaultCommand(new ResetClimber());
    }
    
    public Climber(){
        jaguar = new Jaguar(RobotMap.LeftClimberMotorSlot,RobotMap.LeftClimberMotorChannel);
        //leftJaguar = new Jaguar(2,3); //change to final variables later
        //rightJaguar = new Jaguar(2,5); //change to final variables later
        leftTopSwitch = new DigitalInput(RobotMap.ClimberSwitchSlot, 
                                         RobotMap.LeftClimberSwitchTop);
        leftBottomSwitch = new DigitalInput(RobotMap.ClimberSwitchSlot,
                                            RobotMap.LeftClimberSwitchBottom);
    }
    
    //raise both hooks up to top, or highest position
    public void reset(){
        
        if(leftTopSwitch.get()==RobotMap.ClimberSwitchOpen){
            jaguar.set(RobotMap.ClimberMotorUpSpeed);
        }
        if(leftBottomSwitch.get()==RobotMap.ClimberSwitchClosed){
            jaguar.set(0);
        }
        
    }
    
    //move both hooks down to bottom, or lowest position
    public void climbUp(){
        
        //if(leftBottomSwitch.get()==true)
        SmartDashboard.putBoolean("Bottom climber switch: ",leftBottomSwitch.get());
        SmartDashboard.putNumber("Climber jaguar status: ",jaguar.getSpeed());
        if(leftBottomSwitch.get()==RobotMap.ClimberSwitchOpen){ 
                //&& rightBottomSwitch.get()!=RobotMap.ClimberSwitchClosed){
            //leftJaguar.set(RobotMap.ClimberMotorDownSpeed);
            jaguar.set(RobotMap.ClimberMotorDownSpeed);
        }
        else{
            jaguar.set(0);
        }
    }
    
    //balance the robot if the hooks are not synchronized
    public void level(){
        //need encoders (?)
        //balance robot if hooks are not in same position 
        //move jaguars to average value of current positions
    }
    
}
