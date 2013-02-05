/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Wilson
 */
public class DateUtils {
    public static Date incDateDays(Date d, int days) {
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(d);
        gc.add(Calendar.DAY_OF_MONTH, days);
        return gc.getTime();
    }
}
