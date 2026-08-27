package com.deliveryhero.fwf_evaluator.model;

import java.util.List;
import o.MediaSessionCompatQueueItem;
import o.getCieXyz;
import o.onContentCardDismissed;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class TestTarget {
    private final List<String> values;
    private final Object variation;
    private final Object variationName;

    public final Object component1() {
        return this.variation;
    }

    public final Object component2() {
        return this.variationName;
    }

    public final List<String> component3() {
        return this.values;
    }

    public final List<String> getValues() {
        return this.values;
    }

    public final Object getVariation() {
        return this.variation;
    }

    public final Object getVariationName() {
        return this.variationName;
    }

    public String toString() {
        Object obj = this.variation;
        Object obj2 = this.variationName;
        List<String> list = this.values;
        StringBuilder sb = new StringBuilder("TestTarget(variation=");
        sb.append(obj);
        sb.append(", variationName=");
        sb.append(obj2);
        sb.append(", values=");
        return MediaSessionCompatQueueItem.read(sb, list, ")");
    }

    public TestTarget(Object obj, Object obj2, List<String> list) {
        list.getClass();
        this.variation = obj;
        this.variationName = obj2;
        this.values = list;
    }

    public final boolean evaluateTarget(User user) {
        user.getClass();
        return onContentCardDismissed.write(this.values, user.getAuthUserId()) || onContentCardDismissed.write(this.values, user.getUnAuthUserId()) || onContentCardDismissed.write(this.values, user.getEmail$fwf_client_release());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TestTarget copy$default(TestTarget testTarget, Object obj, Object obj2, List list, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = testTarget.variation;
        }
        if ((i & 2) != 0) {
            obj2 = testTarget.variationName;
        }
        if ((i & 4) != 0) {
            list = testTarget.values;
        }
        return testTarget.copy(obj, obj2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestTarget)) {
            return false;
        }
        TestTarget testTarget = (TestTarget) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.variation, testTarget.variation}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.variationName, testTarget.variationName}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.values, testTarget.values}, getCieXyz.write())).booleanValue();
    }

    public final TestTarget copy(Object obj, Object obj2, List<String> list) {
        list.getClass();
        return new TestTarget(obj, obj2, list);
    }

    public int hashCode() {
        Object obj = this.variation;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.variationName;
        return this.values.hashCode() + (((iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31);
    }
}
