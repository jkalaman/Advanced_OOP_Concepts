
public class Database {
    private String[] colNames;
    private int numRows;
    private String[][] data;

    public String[] getColNames() {
        return colNames;
    }

    public void setColNames(String[] colNames) {
        this.colNames = colNames;
    }

    public int getNumRows() {
        return numRows;
    }

    public void setNumRows(int numRows) {
        this.numRows = numRows;
    }

    public String[][] getData() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }

    public Database(String contents) {
        String[] lines = contents.split("\\r?\\n");
        setColNames(lines[0].split(","));
        setNumRows(lines.length);
        String[][] arr = new String[getNumRows()][getColNames().length];
        for (int i = 0; i < lines.length; i++) {
            String[] tmp = lines[i].split(",");

            for (int j = 0; j < tmp.length; j++) arr[i][j] = tmp[j];
        }
        setData(arr.clone());
    }





    public String getValue(String columnName,int row){
        int colIndex=0;
        for(int i=0; i <getColNames().length; i++){
            if(getColNames()[i] == columnName)
                colIndex = i;
        }

        return this.data[row][colIndex];
    }

}


