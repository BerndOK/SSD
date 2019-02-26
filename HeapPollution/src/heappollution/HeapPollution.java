/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heappollution;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cenuser
 */
public class HeapPollution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List list = new ArrayList();
        List<String> ls = list; // Produces unchecked warning

        List s = new ArrayList<Integer>();
        List<String> ss = s;            // unchecked warning
        s.add(new Integer(42));        // another unchecked warning
        for (String str : ss) {
            System.out.println(str);
        }
    }
}
