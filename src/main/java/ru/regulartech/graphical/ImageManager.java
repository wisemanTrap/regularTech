package ru.regulartech.graphical;

import org.apache.log4j.Logger;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Create by Votrin Andrey (votrin.andrey@caesber.ru).
 * DATE: 21.05.2014
 * TIME: 12:23
 */
public final class ImageManager {
    private static BufferedImage printerImg;
    private static BufferedImage tableImg;
    private static BufferedImage computerImg;
    private static BufferedImage commonImg;
    private static BufferedImage monitorImg;
    private static BufferedImage laptopImg;
    private static BufferedImage routerImg;
    private static BufferedImage roomImage;

    private static BufferedImage computerImgSmall;
    private static BufferedImage printerImgSmall;
    private static BufferedImage laptopImgSmall;

    private static ImageIcon refreshIcon;
    private static ImageIcon searchIcon;

    private static final String systemResourcesDir = ImageManager.class.getProtectionDomain().getCodeSource().getLocation().getPath();
    private final static Logger logger = Logger.getLogger(ImageManager.class);

    private static BufferedImage brokenPrinterImgSmall;
    private static BufferedImage brokenLaptopImgSmall;
    private static BufferedImage brokenMonitorImgSmall;
    private static BufferedImage brokeRouterImgSmall;
    private static BufferedImage brokenPCImageSmall;

    static {
        // блок для обработки логов загрузки изображений
        try {
            computerImg = ImageIO.read(new File(systemResourcesDir + "img/computer.png"));
            printerImg = ImageIO.read(new File(systemResourcesDir + "img/printer.png"));
            monitorImg = ImageIO.read(new File(systemResourcesDir + "img/monitor.png"));
            routerImg = ImageIO.read(new File(systemResourcesDir + "img/1router.png"));
            laptopImg = ImageIO.read(new File(systemResourcesDir + "img/laptop.png"));
            commonImg = ImageIO.read(new File(systemResourcesDir + "img/common.png"));
            tableImg = ImageIO.read(new File(systemResourcesDir + "img/table.png"));
            roomImage = ImageIO.read(new File(systemResourcesDir + "img/room.png"));

            computerImgSmall = ImageIO.read(new File(systemResourcesDir + "img/computer_small.png"));
            printerImgSmall = ImageIO.read(new File(systemResourcesDir + "img/printer_small.png"));
            laptopImgSmall = ImageIO.read(new File(systemResourcesDir + "img/laptop_small.png"));
            monitorImgSmall = ImageIO.read(new File(systemResourcesDir + "img/monitor_small.png"));
            routerImgSmall = ImageIO.read(new File(systemResourcesDir + "img/router_small.png"));

            brokenPCImageSmall = ImageIO.read(new File(systemResourcesDir + "img/computer_broken_small.png"));
            brokenPrinterImgSmall = ImageIO.read(new File(systemResourcesDir + "img/printer_broken_small.png"));
            brokenLaptopImgSmall = ImageIO.read(new File(systemResourcesDir + "img/laptop_broken_small.png"));
            brokenMonitorImgSmall = ImageIO.read(new File(systemResourcesDir + "img/monitor_broken_small.png"));
            brokeRouterImgSmall = ImageIO.read(new File(systemResourcesDir + "img/router_broken_small.png"));

        } catch(IOException e){
            // TODO: in betta version remove printStackTrace
            logger.fatal("{Could not load image.}" + e);
            e.printStackTrace();
        }
        refreshIcon = new ImageIcon(ImageManager.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "img/refresh_icon.png");
        searchIcon = new ImageIcon(ImageManager.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "img/scape_glass.png");


    }

    private static BufferedImage routerImgSmall;
    private static BufferedImage monitorImgSmall;


    public static BufferedImage getRoomImage() {
        return roomImage;
    }

    public static BufferedImage getPrinterImg() {
        return printerImg;
    }

    public static BufferedImage getComputerImg() {
        return computerImg;
    }

    public static BufferedImage getCommonImg() {
        return commonImg;
    }

    public static BufferedImage getMonitorImg() {
        return monitorImg;
    }

    public static BufferedImage getLaptopImg() {
        return laptopImg;
    }

    public static BufferedImage getRouterImg() {
        return routerImg;
    }

    public static BufferedImage getTableImg() {
        return tableImg;
    }

    public static ImageIcon getRefreshIcon() {
        return refreshIcon;
    }

    public static ImageIcon getSearchIcon() {
        return searchIcon;
    }

    public static BufferedImage getComputerImgSmall() {
        return computerImgSmall;
    }

    public static BufferedImage getPrinterImgSmall() {
        return printerImgSmall;
    }

    public static BufferedImage getLaptopImgSmall() {
        return laptopImgSmall;
    }

    public static BufferedImage getRouterImgSmall() {
        return routerImgSmall;
    }

    public static BufferedImage getMonitorImgSmall() {
        return monitorImgSmall;
    }


    public static BufferedImage getBrokenPCImageSmall() {
        return brokenPCImageSmall;
    }

    public static BufferedImage getBrokenPrinterImgSmall() {
        return brokenPrinterImgSmall;
    }

    public static BufferedImage getBrokenLaptopImgSmall() {
        return brokenLaptopImgSmall;
    }

    public static BufferedImage getBrokenMonitorImgSmall() {
        return brokenMonitorImgSmall;
    }

    public static BufferedImage getBrokeRouterImgSmall() {
        return brokeRouterImgSmall;
    }
}
