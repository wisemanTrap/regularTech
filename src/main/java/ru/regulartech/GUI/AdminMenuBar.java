package ru.regulartech.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Create by Votrin Andrey (votrin.andrey@caesber.ru).
 * DATE: 06.04.2014
 * TIME: 15:16
 */
public class AdminMenuBar extends AbstractMenuBar {
    private ReportActionWindow addReportActionWindow;
    private BuchalteryWindow buchWindow;
    public AdminMenuBar() {
        super();
        JMenu buchMenu = new JMenu("Бухгалтерия");

        JMenuItem showReport = new JMenuItem("Показать отчетность");
        JMenuItem reportActions = new JMenuItem("Внести отчетность");

        buchWindow = new BuchalteryWindow("Отчетность");
        addReportActionWindow = new ReportActionWindow("Действия с отчетностью");

        showReport.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                buchWindow.updateTable();
                buchWindow.setVisible(true);
            }
        });
        reportActions.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                addReportActionWindow.setVisible(true);
            }
        });

        buchMenu.add(showReport);
        buchMenu.add(reportActions);

        add(buchMenu);
    }
}
