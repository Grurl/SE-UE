package application;


import javafx.beans.property.StringProperty;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import javafx.beans.property.SimpleIntegerProperty;


public class Room {
private final StringProperty roomName;
private final StringProperty roomNr;
private final IntegerProperty roomDeg;
private final StringProperty roomHeat;
private final StringProperty roomLight;



/**
 * Default constructor.
 */
public Room() {
    this(null, null, null, null, null);
    
}


public Room(String roomNr, String roomName, Integer roomDeg, String roomHeat, String roomLight) {
    this.roomNr = new SimpleStringProperty(roomNr);
    this.roomName = new SimpleStringProperty(roomName);
    this.roomDeg = new SimpleIntegerProperty(roomDeg);
    this.roomHeat = new SimpleStringProperty(roomHeat);
    this.roomLight = new SimpleStringProperty(roomLight);


}

public String getRoomNr() {
    return roomNr.get();
}

public void setRoomNr(String roomNr) {
    this.roomNr.set(roomNr);
}

public StringProperty roomNrProperty() {
    return roomNr;
}


public String getRoomName() {
    return roomName.get();
}

public void setLastName(String roomName) {
    this.roomName.set(roomName);
}

public StringProperty roomNameProperty() {
    return roomName;
}



public Integer getRoomDeg() {
	return roomDeg.get();
}
public void setRoomDeg(Integer roomDeg) {
    this.roomDeg.set(roomDeg);
}

public IntegerProperty roomDegProperty() {
    return roomDeg;
}


public String getRoomHeat() {
	return roomHeat.get();
}

public void setRoomHeat(String roomHeat) {
    this.roomHeat.set(roomHeat);
}

public StringProperty roomHeatProperty() {
    return roomHeat;
}


public String getRoomLight() {
	return roomLight.get();
}
public void setRoomLight(String roomLight) {
    this.roomLight.set(roomLight);
}

public StringProperty roomLightProperty() {
    return roomLight;
}


}