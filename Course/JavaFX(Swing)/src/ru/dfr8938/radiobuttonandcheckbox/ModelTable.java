package ru.dfr8938.radiobuttonandcheckbox;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class ModelTable extends AbstractTableModel {

    private int columnCount;
    private int rowCount;
    private int[][] arr;

    public ModelTable(int columnCount, int rowCount) {
        this.columnCount = columnCount;
        this.rowCount = rowCount;
        this.arr = new int[rowCount][columnCount];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + 1;
            }
        }
    }

    @Override
    public int getRowCount() {
        return this.rowCount;
    }

    @Override
    public int getColumnCount() {
        return this.columnCount;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return arr[rowIndex][columnIndex];
    }
}
