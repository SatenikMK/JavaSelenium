package Array;

public class StringArrayList {


    public StringArrayList(String[] list) {
        this.list = list;
    }

    private String[] list;

    public String[] getList() {
        return list;
    }

    public void add(String item) {
        String[] newlist = new String[list.length + 1];
        for (int i = 0; i < list.length; ++i) {
            newlist[i] = list[i];

        }
        newlist[newlist.length - 1] = item;
        list = newlist;
    }

    public void delete(int index) {
        int newArrayLength = list.length - 1;
        String[] newFood = new String[newArrayLength];
        int j = 0;
        for (int i = 0; i < list.length; ++i) {
            if (i != index) {
                newFood[j] = list[i];
                j++;
            } else {
                newFood[j] = list[i + 1];
                i++;
                j++;
            }
        }
        list = newFood;
    }

    /*public void delete(String item){
        int newArrayLength = list.length - 1;
        String [] newFood = new String[newArrayLength];
        int j = 0;
        for (int i = 0; i < list.length; ++i) {
            if (list[i] != item) {
                newFood[j] = list[i];
                j++;
            } else {
                newFood[j] = list[i + 1];
                i++;
                j++;
            }
        }
        list = newFood;
    }*/


    public void insertItem(int index, String item) {
        int newArrayLength = list.length + 1;
        String[] newArray = new String[newArrayLength];
        newArray[index] = item;
        for (int i = 0; i < list.length; ++i) {
            for (int j = 0; j < index; ++j) {
                newArray[j] = list[j];
            }
            for (int k = index + 1; k < newArrayLength; ++k) {
                newArray[k] = list[k - 1];
            }
        }

        list = newArray;

    }


    public static void main(String[] args) {
        String[] list = new String[]{"apple", "milk", "chocolate", "pizza"};
        for (int i = 0; i < list.length; ++i) {
            System.out.println(list[i]);
        }
        System.out.println("**********************Add new item");

        StringArrayList arrayList = new StringArrayList(list);
        arrayList.add("mandarin");

        String[] addList = arrayList.getList();
        for (int i = 0; i < addList.length; ++i) {
            System.out.println(addList[i]);
        }

        System.out.println("**********************Delete item");
        arrayList.delete(1);

        for (int i = 0; i < arrayList.getList().length; ++i) {
            System.out.println(arrayList.getList()[i]);
        }

        System.out.println("**********************Insert item");
        arrayList.insertItem(2, "icecreem");

        for (int i = 0; i < arrayList.getList().length; ++i) {
            System.out.println(arrayList.getList()[i]);
        }

        /*System.out.println("*******************Delete wit item");
        arrayList.delete("milk");

        for (int i = 0; i<arrayList.getList().length; ++i){
            System.out.println(arrayList.getList()[i]);
        }*/


    }
}
