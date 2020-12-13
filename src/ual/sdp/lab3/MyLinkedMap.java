package ual.sdp.lab3;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//Class used get just the V on a (K,V) Set
public class MyLinkedMap<K, V> extends LinkedHashMap<K, V>
{

    public V getValue(long i)
    {

        Map.Entry<K, V>entry = this.getEntry(i);
        if(entry == null) return null;

        return entry.getValue();
    }

    public Map.Entry<K, V> getEntry(long i)
    {
        // check if negetive index provided
        Set<Map.Entry<K,V>> entries = entrySet();
        int j = 0;

        for(Map.Entry<K, V>entry : entries)
            if(j++ == i)return entry;

        return null;

    }


}

