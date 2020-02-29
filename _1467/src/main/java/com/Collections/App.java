package com.Collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger LOGGER= LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        CustomeList<Integer> list = new CustomeList<>();

        //Add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        LOGGER.info(list);

        //Remove elements from index
        list.remove(2);
        LOGGER.info(list);

        //Get element with index
        LOGGER.info( list.get(0) );
        LOGGER.info( list.get(1) );

        //List Size
        LOGGER.info(list.size());
    }
}
