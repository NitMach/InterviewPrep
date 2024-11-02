import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class TimeMap {
    private Map<String, TreeMap<Integer, String>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key)){
            map.get(key).put(timestamp, value);
        }else{
            map.put(key, new TreeMap<>());
            map.get(key).put(timestamp, value);
        }
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }

        Integer closestTimestamp = map.get(key).floorKey(timestamp);

        if (closestTimestamp == null) {
            return "";
        }

        return map.get(key).get(closestTimestamp);
    }
}


/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */