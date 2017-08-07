Just another Scala Http frameworks benchmarking

# Scenario:
- Plain text (assert response code: 200, body: alive)
- Users: 400 
- Ramp-up period: 20 seconds
- Loop count: 1000
- Connect timeout: 100 millis
- Response timeout: 200 millis
- Total requests: 400000

# Frameworks:

### Http4s:

| Run           | Throughput (peak rps) | Time     |Errors   |
| ------------- | --------------------- | -------- | ------- |
| 1st           | 11300                 | 00:00:35 |0.04%    |
| 2nd           | 15900                 | 00:00:25 |0.04%    |
| 3rd           | 16000                 | 00:00:25 |0.03%    |


### Finch:

| Run           | Throughput (peak rps) | Time     |Errors   |
| ------------- | --------------------- | -------- | ------- |
| 1st           | 5602                  | 00:01:12 |13.7%    |
| 2nd           | 11644                 | 00:00:34 |1.7%     |
| 3rd           | 12600                 | 00:00:32 |1.44%    |


### Akka Http:

| Run           | Throughput (peak rps) | Time     |Errors   |
| ------------- | --------------------- | -------- | ------- |
| 1st           | 1971                  | 00:03:23 |53.8%    |
| 2nd           | 12000                 | 00:00:41 |5.05%    |
| 3rd           | 13800                 | 00:00:44 |5.7%     |



