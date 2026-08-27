package com.mapbox.common;

import bo.app.af$$ExternalSyntheticOutline1;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public class TaskOptions implements Serializable {
    private final long delay;
    private final TaskPriority priority;

    public long getDelay() {
        return this.delay;
    }

    public TaskPriority getPriority() {
        return this.priority;
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    public TaskOptions(long j) {
        this.delay = j;
        this.priority = TaskPriority.DEFAULT;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[delay: ");
        af$$ExternalSyntheticOutline1.m(this.delay, ", priority: ", sb);
        sb.append(RecordUtils.fieldToString(this.priority));
        sb.append("]");
        return sb.toString();
    }

    public int hashCode() {
        long j = this.delay;
        return Objects.hash(Long.valueOf(j), this.priority);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskOptions taskOptions = (TaskOptions) obj;
        return this.delay == taskOptions.delay && Objects.equals(this.priority, taskOptions.priority);
    }

    public TaskOptions(long j, TaskPriority taskPriority) {
        this.delay = j;
        this.priority = taskPriority;
    }
}
