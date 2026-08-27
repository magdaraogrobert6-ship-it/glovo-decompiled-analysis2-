package androidx.compose.ui.platform;

import androidx.compose.ui.node.ModifierNodeElement;
import com.huawei.hms.push.constant.RemoteMessageConst;
import o.getCieXyz;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes4.dex */
final class TestTagElement extends ModifierNodeElement<TestTagNode> {
    private final String tag;

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TestTagNode create() {
        return new TestTagNode(this.tag);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.tag.hashCode();
    }

    public TestTagElement(String str) {
        this.tag = str;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("testTag");
        inspectorInfo.getProperties().set(RemoteMessageConst.Notification.TAG, this.tag);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestTagElement)) {
            return false;
        }
        Object[] objArr = {this.tag, ((TestTagElement) obj).tag};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TestTagNode testTagNode) {
        testTagNode.setTag(this.tag);
    }
}
