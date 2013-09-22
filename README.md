ComparisonFastJsonAndGson
=========================

Just a little comparison for effectiveness between Fastjson and Gson

After some little comparisons, I found:

When the parsing data is not huge, Gson is faster than Fastjson, but the difference becomes small when data is huge.

The experiments with 2048m heap space (result time with milli seconds):

1. 6000 elements: 
  Fastjson: 486
  Gson:     222
  
2. 10000 elements:
  Fastjson: 518
  Gson:     236
  
3. 100000 elements:
  Fastjson: 948
  Gson:     726
  
4. 500000 elements:
  Fastjson: 3454
  Gson:     3640
  
  
5. 1000000 elements:
  Fastjson: 5728
  Gson:     5687
  
  
