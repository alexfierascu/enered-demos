package Abstractizare2;


public interface OperareMasina {

  // constant declarations, if any


  // method signatures
  void turn (
      Directie direction,
      double radius,
      double startSpeed,
      double endSpeed
  );


  void changeLanes (
      Directie direction,
      double startSpeed,
      double endSpeed
  );


  boolean signalTurn (
      Directie direction,
      boolean signalOn
  );


  int getRadarFront (
      double distanceToCar,
      double speedOfCar
  );


  int getRadarRear (
      double distanceToCar,
      double speedOfCar
  );

  // more method signatures

}
