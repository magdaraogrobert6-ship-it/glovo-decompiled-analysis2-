package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.LocaleList;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class AnnotatedStringKt$$ExternalSyntheticLambda0 implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocaleList f$0;

    public /* synthetic */ AnnotatedStringKt$$ExternalSyntheticLambda0(int i, LocaleList localeList) {
        this.$r8$classId = i;
        this.f$0 = localeList;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        String str = (String) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int iIntValue2 = ((Integer) obj3).intValue();
        LocaleList localeList = this.f$0;
        if (i == 0) {
            return AnnotatedStringKt.decapitalize$lambda$0(localeList, str, iIntValue, iIntValue2);
        }
        if (i != 1) {
            return i != 2 ? AnnotatedStringKt.toLowerCase$lambda$0(localeList, str, iIntValue, iIntValue2) : AnnotatedStringKt.toUpperCase$lambda$0(localeList, str, iIntValue, iIntValue2);
        }
        return AnnotatedStringKt.capitalize$lambda$0(localeList, str, iIntValue, iIntValue2);
    }
}
