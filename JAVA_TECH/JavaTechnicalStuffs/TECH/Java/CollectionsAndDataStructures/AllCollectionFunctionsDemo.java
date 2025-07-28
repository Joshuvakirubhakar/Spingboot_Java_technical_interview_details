package JAVA_TECH.DesignPatterns.TECH.Java.CollectionsAndDataStructures;

        import java.util.*;

        public class AllCollectionFunctionsDemo {

            public static void main(String[] args) {

                // --- Collection interface methods ---
                Collection<String> collection = new ArrayList<>();
                collection.add("one");
                System.out.println("After add: " + collection);
                collection.addAll(List.of("two", "three"));
                System.out.println("After addAll: " + collection);
                System.out.println("Contains 'one': " + collection.contains("one"));
                System.out.println("ContainsAll ['one', 'two']: " + collection.containsAll(List.of("one", "two")));
                System.out.println("IsEmpty: " + collection.isEmpty());
                collection.remove("one");
                System.out.println("After remove 'one': " + collection);
                collection.removeAll(List.of("two"));
                System.out.println("After removeAll ['two']: " + collection);
                collection.retainAll(List.of("three"));
                System.out.println("After retainAll ['three']: " + collection);
                System.out.println("Size: " + collection.size());
                System.out.println("ToArray: " + Arrays.toString(collection.toArray()));
                System.out.println("ToArray (String[]): " + Arrays.toString(collection.toArray(new String[0])));

                // --- ArrayList methods ---
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add("A");
                arrayList.add(0, "B");
                System.out.println("ArrayList after add: " + arrayList);
                System.out.println("Get(0): " + arrayList.get(0));
                System.out.println("IndexOf 'A': " + arrayList.indexOf("A"));
                System.out.println("LastIndexOf 'A': " + arrayList.lastIndexOf("A"));
                arrayList.remove(0);
                System.out.println("ArrayList after remove(0): " + arrayList);
                arrayList.set(0, "C");
                System.out.println("ArrayList after set(0, 'C'): " + arrayList);
                System.out.println("SubList(0,1): " + arrayList.subList(0, 1));
                arrayList.ensureCapacity(10);
                arrayList.trimToSize();
                arrayList.sort(Comparator.naturalOrder());
                System.out.println("ArrayList after sort: " + arrayList);
                arrayList.replaceAll(s -> s.toLowerCase());
                System.out.println("ArrayList after replaceAll: " + arrayList);
                System.out.println("Spliterator: " + arrayList.spliterator());

                // --- Set methods (HashSet) ---
                Set<String> set = new HashSet<>();
                set.add("one");
                set.add("two");
                System.out.println("Set after add: " + set);
                System.out.println("Set contains 'one': " + set.contains("one"));
                set.remove("two");
                System.out.println("Set after remove 'two': " + set);
                System.out.println("Set size: " + set.size());
                System.out.println("Set isEmpty: " + set.isEmpty());
                set.clear();
                System.out.println("Set after clear: " + set);

                // --- Map methods (HashMap) ---
                Map<String, Integer> map = new HashMap<>();
                map.put("a", 1);
                map.put("b", 2);
                System.out.println("Map after put: " + map);
                System.out.println("Get 'a': " + map.get("a"));
                map.remove("a");
                System.out.println("Map after remove 'a': " + map);
                System.out.println("ContainsKey 'b': " + map.containsKey("b"));
                System.out.println("ContainsValue 2: " + map.containsValue(2));
                System.out.println("Map size: " + map.size());
                System.out.println("Map isEmpty: " + map.isEmpty());
                map.clear();
                System.out.println("Map after clear: " + map);
                map.putIfAbsent("c", 3);
                System.out.println("Map after putIfAbsent: " + map);
                System.out.println("GetOrDefault 'd': " + map.getOrDefault("d", 0));
                map.forEach((k, v) -> System.out.println("forEach: " + k + ":" + v));
                map.replace("c", 4);
                System.out.println("Map after replace: " + map);
                map.replace("c", 4, 5);
                System.out.println("Map after conditional replace: " + map);
                map.compute("c", (k, v) -> v == null ? 1 : v + 1);
                System.out.println("Map after compute: " + map);
                map.computeIfAbsent("e", k -> 10);
                System.out.println("Map after computeIfAbsent: " + map);
                map.computeIfPresent("e", (k, v) -> v + 10);
                System.out.println("Map after computeIfPresent: " + map);
                map.merge("e", 5, Integer::sum);
                System.out.println("Map after merge: " + map);
                System.out.println("EntrySet: " + map.entrySet());
                System.out.println("KeySet: " + map.keySet());
                System.out.println("Values: " + map.values());

                // --- Collections utility methods ---
                List<String> sampleList = new ArrayList<>(List.of("a", "b", "c"));
                Collections.sort(sampleList);
                System.out.println("After Collections.sort: " + sampleList);
                Collections.reverse(sampleList);
                System.out.println("After Collections.reverse: " + sampleList);
                Collections.shuffle(sampleList);
                System.out.println("After Collections.shuffle: " + sampleList);
                System.out.println("UnmodifiableList: " + Collections.unmodifiableList(sampleList));
                System.out.println("SynchronizedList: " + Collections.synchronizedList(sampleList));
                System.out.println("Min: " + Collections.min(sampleList));
                System.out.println("Max: " + Collections.max(sampleList));
                System.out.println("Frequency of 'a': " + Collections.frequency(sampleList, "a"));
                System.out.println("BinarySearch for 'b': " + Collections.binarySearch(sampleList, "b"));
                Collections.copy(new ArrayList<>(sampleList), sampleList);
                System.out.println("After Collections.copy: " + sampleList);

                // --- Arrays utility methods ---
                String[] arr = {"z", "x", "y"};
                Arrays.sort(arr);
                System.out.println("Arrays after sort: " + Arrays.toString(arr));
                System.out.println("Arrays.copyOf: " + Arrays.toString(Arrays.copyOf(arr, 5)));
                Arrays.fill(arr, "filled");
                System.out.println("Arrays after fill: " + Arrays.toString(arr));
                System.out.println("Arrays.equals: " + Arrays.equals(arr, new String[]{"filled", "filled", "filled"}));
                System.out.println("Arrays.toString: " + Arrays.toString(arr));
                System.out.println("Arrays.asList: " + Arrays.asList("1", "2", "3"));

                System.out.println("All methods executed.");
            }
        }