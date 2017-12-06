package cn.shch.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
       Date date = MyDateTimeCommon.ObtainFirstDayBySpecificDate(new Date(), Unit.UNIT_OF_WEEK);
       System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date));
       System.out.println(Calendar.DAY_OF_WEEK);
    }
}
