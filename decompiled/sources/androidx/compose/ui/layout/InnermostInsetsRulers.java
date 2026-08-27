package androidx.compose.ui.layout;

import java.util.ArrayList;
import java.util.Arrays;
import o.onContentCardClicked;

/* JADX INFO: loaded from: classes.dex */
final class InnermostInsetsRulers implements WindowInsetsRulers {
    private final RectRulers current;
    private final RectRulers maximum;
    private final String name;
    private final WindowInsetsRulers[] rulers;

    @Override // androidx.compose.ui.layout.WindowInsetsRulers
    public RectRulers getCurrent() {
        return this.current;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsRulers
    public RectRulers getMaximum() {
        return this.maximum;
    }

    public final String getName() {
        return this.name;
    }

    public final WindowInsetsRulers[] getRulers() {
        return this.rulers;
    }

    @Override // androidx.compose.ui.layout.WindowInsetsRulers
    public WindowInsetsAnimation getAnimation(Placeable.PlacementScope placementScope) {
        return new InnermostAnimationProperties(placementScope, this.rulers);
    }

    public InnermostInsetsRulers(String str, WindowInsetsRulers[] windowInsetsRulersArr) {
        this.name = str;
        this.rulers = windowInsetsRulersArr;
        RectRulers.Companion companion = RectRulers.Companion;
        ArrayList arrayList = new ArrayList(windowInsetsRulersArr.length);
        for (WindowInsetsRulers windowInsetsRulers : windowInsetsRulersArr) {
            arrayList.add(windowInsetsRulers.getCurrent());
        }
        RectRulers[] rectRulersArr = (RectRulers[]) arrayList.toArray(new RectRulers[0]);
        this.current = RectRulersKt.innermostOf(companion, (RectRulers[]) Arrays.copyOf(rectRulersArr, rectRulersArr.length));
        RectRulers.Companion companion2 = RectRulers.Companion;
        WindowInsetsRulers[] windowInsetsRulersArr2 = this.rulers;
        ArrayList arrayList2 = new ArrayList(windowInsetsRulersArr2.length);
        for (WindowInsetsRulers windowInsetsRulers2 : windowInsetsRulersArr2) {
            arrayList2.add(windowInsetsRulers2.getMaximum());
        }
        RectRulers[] rectRulersArr2 = (RectRulers[]) arrayList2.toArray(new RectRulers[0]);
        this.maximum = RectRulersKt.innermostOf(companion2, (RectRulers[]) Arrays.copyOf(rectRulersArr2, rectRulersArr2.length));
    }

    public String toString() {
        String str = this.name;
        return str == null ? onContentCardClicked.serializer(this.rulers, null, "innermostOf(", null, 57) : str;
    }
}
