# An explanation, I suppose

Ways of carrying out parallelism in Java.

- [RecursiveAction](#recursiveaction)
- [RecursiveTask](#recursivetask)

---


## `RecursiveAction`

```java
import java.util.concurrent.RecursiveAction

public class SumTask extends RecursiveAction {

}
```

---


## `RecursiveTask`

```java
import java.util.concurrent.RecursiveTask

public class SumTask extends RecursiveTask<Integer> {

}
```

---

### Assignment

Use either `RecursiveAction` or `RecursiveTask` to create and divide a task.