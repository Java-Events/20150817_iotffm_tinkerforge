package org.rapidpm.event.iotffm.v001;

import com.tinkerforge.AlreadyConnectedException;
import com.tinkerforge.IPConnection;
import com.tinkerforge.NotConnectedException;
import org.rapidpm.event.iotffm.BrickletReader;

import java.io.IOException;

/**
 * Created by svenruppert on 17.08.15.
 */
public class Main {


  public static final String LOCALHOST = "127.0.0.1";

  public static void main(String[] args) throws IOException, AlreadyConnectedException, NotConnectedException {


    final BrickletReader brickletReader = new BrickletReader();
    brickletReader.findBricklets(LOCALHOST);


  }
}
