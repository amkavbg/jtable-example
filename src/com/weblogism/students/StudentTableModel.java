/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weblogism.students;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author sebastien
 */
public class StudentTableModel  extends AbstractTableModel {
    private final static String[] COLUMNS = { "Last Name", "First Name", "Class"};
    
    private List<Student> students;
    
    public StudentTableModel(List<Student> students) {
        this.students = students;
    }

    @Override
    public int getRowCount() {
        return students.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int column) {
        return COLUMNS[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Student student = students.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return student.lastName;
            case 1:
                return student.firstName;
            case 2:
                return student.form;
        }
        return null;
    }
    
    
}
