/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienich.Helper;

import Model.NhanVien;

/**
 *
 * @author Admin
 */
public class Auth {
    public static NhanVien USER = null;
     public static void logoff() {
        Auth.USER = null;
    }

    
    public static boolean authenticated() {
        return Auth.USER != null;
    }
}
