// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

/*  Imports */
/*    WPI */
import edu.wpi.first.wpilibj.AddressableLED;
import edu.wpi.first.wpilibj.AddressableLEDBuffer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
/*    Robot */
import frc.robot.Constants.LEDLightsConstants;
import frc.robot.Constants.LEDLightsConstants.LEDColorsConstants;

public class LEDLights extends SubsystemBase {
  /*  Declaring Variables */
  //    Creates AdressableLED
  private AddressableLED lightLED;
  //    Creates AdressableLEDBuffer
  private AddressableLEDBuffer LEDBuffer;

  private int rainbowFirstPixel = 1;

  /** Creates a new LedsLights. */
  public LEDLights() {
    /*  Initializing Variables */
    //    Initialize addressableLED
    lightLED = new AddressableLED(LEDLightsConstants.LEDLIGHTS_PORT);
    //    Initialize addressableLEDBuffer
    LEDBuffer = new AddressableLEDBuffer(LEDLightsConstants.LEDLIGHTS_LENGTH);

    //  Sets Length of LED lights
    lightLED.setLength(LEDBuffer.getLength());
    //  Activates LED lights
    lightLED.start();
  }

  public void setRGB(int r, int g, int b){
    //  
    for (int i = 0; i < LEDBuffer.getLength(); i++){

      LEDBuffer.setRGB(i, r, g, b);

    }

    lightLED.setData(LEDBuffer);
  }

  public void rainbow(){

    for (int i = 0; i < LEDBuffer.getLength(); i++){
            
      rainbowFirstPixel += 3;

      rainbowFirstPixel %= 180;

      var hue = (rainbowFirstPixel + ((i * 180 / LEDBuffer.getLength())) % 180);
      
      LEDBuffer.setHSV(i, hue, LEDColorsConstants.RAINBOW_SAT, LEDColorsConstants.RAINBOW_VAL);

    }

    
  }

  public void rainbowSolid(){

    for (int i = 0; i < LEDBuffer.getLength(); i++){

      final var hue = (rainbowFirstPixel + ((i * 180 / LEDBuffer.getLength())) % 180);
      
      LEDBuffer.setHSV(i, hue, LEDColorsConstants.RAINBOW_SAT, LEDColorsConstants.RAINBOW_VAL);
    }

    lightLED.setData(LEDBuffer);
  }
  public void setData(){
    lightLED.setData(LEDBuffer);
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
