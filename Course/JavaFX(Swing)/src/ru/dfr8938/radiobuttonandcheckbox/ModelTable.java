package ru.dfr8938.radiobuttonandcheckbox;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class ModelTable extends AbstractTableModel {

    private int columnCount;
    private int rowCount;
    private List<String[]> list;

    public ModelTable(int columnCount, int rowCount) {
        this.columnCount = columnCount;
        this.rowCount = rowCount;
        this.list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            list.add(new String[getColumnCount()]);
        }
    }

    public void addListValue(String[] row) {
        String[] rowTable = new String[getColumnCount()];
        rowTable = row;
        list.add(rowTable);
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "id";
        } else if (columnIndex == 1) {
            return "title";
        } else if (columnIndex == 2) {
            return "isbn";
        } else {
            return "description";
        }
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return this.columnCount;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String[] rows = list.get(rowIndex);
        return rows[columnIndex];
    }
}
