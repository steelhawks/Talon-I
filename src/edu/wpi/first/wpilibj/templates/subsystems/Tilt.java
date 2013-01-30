/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.templates.OI;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.Retract;
import edu.wpi.first.wpilibj.templates.commands.TiltJagStop;

/**
 *
 * @author Developer
 */
public class Tilt extends Subsystem{
    Jaguar TiltMotor = new Jaguar(RobotMap.TiltMotorSlot, RobotMap.TiltMotorChannel);
    DigitalInput TiltSwitchExt = new DigitalInput(RobotMap.TiltSwitchExtend);
    DigitalInput TiltSwitchRet = new DigitalInput(RobotMap.TiltSwitchRetract);
    
    
    protected void  initDefaultCommand(){
        setDefaultCommand(new TiltJagStop());
    }
    
    public void extend(){
        if(TiltSwitchExt.get()==RobotMap.TiltSwitchClosed){
            TiltMotor.set(0);
        }
        else {
          TiltMotor.set(RobotMap.TiltExtendSpeed);  
        }    
    }
    
    //issue: jaguar in port 3 is in reverse/TiltRetractSpeed as default
    public void reset(){
        if(TiltSwitchRet.get()==RobotMap.TiltSwitchClosed){
            TiltMotor.set (0);
        }
        else {
            TiltMotor.set(RobotMap.TiltRetractSpeed);
        }
        
        SmartDashboard.putData("Tilting Jaguar value", TiltMotor);
        
    }
    
    public void stop(){
        TiltMotor.set(0);
    }
}