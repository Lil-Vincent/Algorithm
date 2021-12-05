# ListNode爆红
Cannot resolve symbol 'ListNode'
添加
```java
    public class ListNode{
        int val;
        ListNode next;

        public ListNode(int x){
            val=x;
        }
    }
```

# BufferedReader 读取输入文本
"new"关键字表示您要建构一个对象为您所用，BufferedReader buf表示声明一个类型为BufferedReader的对象变量，而new BufferedReader()表示以BufferedReader类建构一个对象，newInputStreamReader(System.in)表示接受一个System.in对象来建构一个InputStreamReader对象。

```java
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
```