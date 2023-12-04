package com.mycompany;

import javax.swing.*;
import java.awt.*;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatNightOwlIJTheme;

public class App 
{
    public static void main( String[] args )
    {
        // GenerateOTP generateOTP = new GenerateOTP();
        // Thread thread = new Thread(generateOTP);
        // thread.start();

        // NetworkApp app = new NetworkApp();
        // NetworkApp.getInstance().port();
        // NetworkApp.getInstance().protocol();
        // NetworkApp.getInstance().domainName();
        // NetworkApp.getInstance().ipAddress();
        // NetworkApp.getInstance().host();

        FlatRobotoFont.install();

        FlatLaf.registerCustomDefaultsSource("com.themes");
        FlatNightOwlIJTheme.setup();
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 14));
        new NetworkAppGui();

        // ?ADD DATABASE IMPLEMENTATION
    }
}
