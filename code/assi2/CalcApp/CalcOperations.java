package CalcApp;


/**
* CalcApp/CalcOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Calc.idl
* Sunday, 21 May, 2023 12:21:49 PM IST
*/

public interface CalcOperations 
{
  float sum (float a, float b);
  float div (float a, float b) throws CalcApp.CalcPackage.DivisionByZero;
  float mul (float a, float b);
  float sub (float a, float b);
} // interface CalcOperations
