package androidx.compose.ui.text;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.unit.TextUnitType;
import androidx.sqlite.SQLite;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.ff$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.AnchoredDraggableKt;
import o.ContextMenuScope;
import o.getCieXyz;
import o.instance_delegatelambda0;
import o.invalidateShadow;
import o.onContentCardDismissed;
import o.onItemDismisslambda0;
import o.onViewAttachedToWindowlambda0;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.removeNodeAtDepth;
import o.setNativeShader;

/* JADX INFO: loaded from: classes.dex */
public final class AnnotatedString implements CharSequence {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final invalidateShadow Saver = SaversKt.getAnnotatedStringSaver();
    private final List<Range<? extends Annotation>> annotations;
    private final List<Range<ParagraphStyle>> paragraphStylesOrNull;
    private final List<Range<SpanStyle>> spanStylesOrNull;
    private final String text;

    public interface Annotation {
    }

    public static final class Builder implements Appendable {
        public static final int $stable = 8;
        private final List<MutableRange<? extends Annotation>> annotations;
        private final BulletScope bulletScope;
        private final List<MutableRange<? extends Object>> styleStack;
        private final StringBuilder text;

        public static final class MutableRange<T> {
            public static final Companion Companion = new Companion(null);
            private int end;
            private final T item;
            private final int start;
            private final String tag;

            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final <T> MutableRange<T> fromRange(Range<T> range) {
                    return new MutableRange<>(range.getItem(), range.getStart(), range.getEnd(), range.getTag());
                }

                private Companion() {
                }
            }

            public final T component1() {
                return this.item;
            }

            public final int component2() {
                return this.start;
            }

            public final int component3() {
                return this.end;
            }

            public final String component4() {
                return this.tag;
            }

            public final int getEnd() {
                return this.end;
            }

            public final T getItem() {
                return this.item;
            }

            public final int getStart() {
                return this.start;
            }

            public final String getTag() {
                return this.tag;
            }

            public final void setEnd(int i) {
                this.end = i;
            }

            public final MutableRange<T> copy(T t, int i, int i2, String str) {
                return new MutableRange<>(t, i, i2, str);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ MutableRange copy$default(MutableRange mutableRange, Object obj, int i, int i2, String str, int i3, Object obj2) {
                if ((i3 & 1) != 0) {
                    obj = mutableRange.item;
                }
                if ((i3 & 2) != 0) {
                    i = mutableRange.start;
                }
                if ((i3 & 4) != 0) {
                    i2 = mutableRange.end;
                }
                if ((i3 & 8) != 0) {
                    str = mutableRange.tag;
                }
                return mutableRange.copy(obj, i, i2, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) obj;
                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.item, mutableRange.item}, getCieXyz.write())).booleanValue() || this.start != mutableRange.start || this.end != mutableRange.end) {
                    return false;
                }
                return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.tag, mutableRange.tag}, getCieXyz.write())).booleanValue();
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("MutableRange(item=");
                sb.append(this.item);
                sb.append(", start=");
                sb.append(this.start);
                sb.append(", end=");
                sb.append(this.end);
                sb.append(", tag=");
                return ff$$ExternalSyntheticOutline0.m(sb, this.tag, ')');
            }

            public static /* synthetic */ Range toRange$default(MutableRange mutableRange, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = Integer.MIN_VALUE;
                }
                return mutableRange.toRange(i);
            }

            public int hashCode() {
                T t = this.item;
                return this.tag.hashCode() + af$$ExternalSyntheticOutline0.m(this.end, af$$ExternalSyntheticOutline0.m(this.start, (t == null ? 0 : t.hashCode()) * 31, 31), 31);
            }

            public /* synthetic */ MutableRange(Object obj, int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? "" : str);
            }

            public static /* synthetic */ Range toRange$default(MutableRange mutableRange, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, int i2, Object obj) {
                if ((i2 & 2) != 0) {
                    i = Integer.MIN_VALUE;
                }
                return mutableRange.toRange(r8lambdaunavo3sxub_pc9xroryotnrlvsm, i);
            }

            public MutableRange(T t, int i, int i2, String str) {
                this.item = t;
                this.start = i;
                this.end = i2;
                this.tag = str;
            }

            public final <R> Range<R> toRange(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i) {
                int i2 = this.end;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (i == Integer.MIN_VALUE) {
                    InlineClassHelperKt.throwIllegalStateException("Item.end should be set first");
                }
                return new Range<>(r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this.item), this.start, i, this.tag);
            }

            public final Range<T> toRange(int i) {
                int i2 = this.end;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (i == Integer.MIN_VALUE) {
                    InlineClassHelperKt.throwIllegalStateException("Item.end should be set first");
                }
                return new Range<>(this.item, this.start, i, this.tag);
            }
        }

        public static final class BulletScope {
            public static final int $stable = 8;
            private final Builder builder;
            private final List<onViewAttachedToWindowlambda0> bulletListSettingStack = new ArrayList();

            public final Builder getBuilder$ui_text() {
                return this.builder;
            }

            public final List<onViewAttachedToWindowlambda0> getBulletListSettingStack$ui_text() {
                return this.bulletListSettingStack;
            }

            public BulletScope(Builder builder) {
                this.builder = builder;
            }
        }

        public final void append(AnnotatedString annotatedString, int i, int i2) {
            int length = this.text.length();
            this.text.append((CharSequence) annotatedString.getText(), i, i2);
            List localAnnotations$default = AnnotatedStringKt.getLocalAnnotations$default(annotatedString, i, i2, null, 4, null);
            if (localAnnotations$default != null) {
                int size = localAnnotations$default.size();
                for (int i3 = 0; i3 < size; i3++) {
                    Range range = (Range) localAnnotations$default.get(i3);
                    List<MutableRange<? extends Annotation>> list = this.annotations;
                    Object item = range.getItem();
                    int start = range.getStart();
                    list.add(new MutableRange<>(item, start + length, range.getEnd() + length, range.getTag()));
                }
            }
        }

        public final int getLength() {
            return this.text.length();
        }

        public final void mapAnnotations$ui_text(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            int size = this.annotations.size();
            for (int i = 0; i < size; i++) {
                this.annotations.set(i, MutableRange.Companion.fromRange((Range) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(MutableRange.toRange$default(this.annotations.get(i), 0, 1, null))));
            }
        }

        public final void pop(int i) {
            if (i >= this.styleStack.size()) {
                InlineClassHelperKt.throwIllegalStateException(i + " should be less than " + this.styleStack.size());
            }
            while (this.styleStack.size() - 1 >= i) {
                pop();
            }
        }

        public final int pushBullet(Bullet bullet) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(bullet, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushLink(LinkAnnotation linkAnnotation) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(linkAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushStringAnnotation(String str, String str2) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(StringAnnotation.m3023boximpl(StringAnnotation.m3024constructorimpl(str2)), this.text.length(), 0, str, 4, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushStyle(SpanStyle spanStyle) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(spanStyle, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushTtsAnnotation(TtsAnnotation ttsAnnotation) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(ttsAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        @ExperimentalTextApi
        @onItemDismisslambda0
        public final int pushUrlAnnotation(UrlAnnotation urlAnnotation) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(urlAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final AnnotatedString toAnnotatedString() {
            String string = this.text.toString();
            List<MutableRange<? extends Annotation>> list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i).toRange(this.text.length()));
            }
            return new AnnotatedString(string, arrayList);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x007d  */
        /* JADX INFO: renamed from: withBulletList-o2QH7mI, reason: not valid java name */
        public final <R> R m2884withBulletListo2QH7mI(long j, Bullet bullet, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            long em;
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) onContentCardDismissed.MediaBrowserCompatMediaItem((List) this.bulletScope.getBulletListSettingStack$ui_text());
            if (onviewattachedtowindowlambda0 != null) {
                long jM3876unboximpl = ((TextUnit) onviewattachedtowindowlambda0.serializer).m3876unboximpl();
                if (!TextUnitType.m3895equalsimpl0(TextUnit.m3866getTypeUIouoOA(jM3876unboximpl), TextUnit.m3866getTypeUIouoOA(j))) {
                    InlineClassHelperKt.throwIllegalStateException("Indentation unit types of nested bullet lists must match. Current " + ((Object) TextUnit.m3874toStringimpl(jM3876unboximpl)) + " and previous is " + ((Object) TextUnit.m3874toStringimpl(j)));
                }
                long jM3866getTypeUIouoOA = TextUnit.m3866getTypeUIouoOA(j);
                TextUnitType.Companion companion = TextUnitType.Companion;
                if (TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3900getSpUIouoOA())) {
                    em = TextUnitKt.getSp(TextUnit.m3867getValueimpl(jM3876unboximpl) + TextUnit.m3867getValueimpl(j));
                } else if (TextUnitType.m3895equalsimpl0(jM3866getTypeUIouoOA, companion.m3899getEmUIouoOA())) {
                    em = TextUnitKt.getEm(TextUnit.m3867getValueimpl(jM3876unboximpl) + TextUnit.m3867getValueimpl(j));
                } else {
                    em = j;
                }
            } else {
                em = j;
            }
            int iPushStyle = pushStyle(new ParagraphStyle(0, 0, 0L, new TextIndent(em, em, null), (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 503, (DefaultConstructorMarker) null));
            this.bulletScope.getBulletListSettingStack$ui_text().add(new onViewAttachedToWindowlambda0(TextUnit.m3857boximpl(em), bullet));
            try {
                return (R) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(this.bulletScope);
            } finally {
                if (!this.bulletScope.getBulletListSettingStack$ui_text().isEmpty()) {
                    this.bulletScope.getBulletListSettingStack$ui_text().remove(SQLite.write((List) this.bulletScope.getBulletListSettingStack$ui_text()));
                }
                pop(iPushStyle);
            }
        }

        /* JADX INFO: renamed from: withBulletList-o2QH7mI$default, reason: not valid java name */
        public static /* synthetic */ Object m2882withBulletListo2QH7mI$default(Builder builder, long j, Bullet bullet, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
            if ((i & 1) != 0) {
                j = Bullet.Companion.m2893getDefaultIndentationXSAIIZE();
            }
            if ((i & 2) != 0) {
                bullet = Bullet.Companion.getDefault();
            }
            return builder.m2884withBulletListo2QH7mI(j, bullet, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        public final void addStringAnnotation(String str, String str2, int i, int i2) {
            this.annotations.add(new MutableRange<>(StringAnnotation.m3023boximpl(StringAnnotation.m3024constructorimpl(str2)), i, i2, str));
        }

        public final void flatMapAnnotations$ui_text(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            List<MutableRange<? extends Annotation>> list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                List list2 = (List) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(MutableRange.toRange$default(list.get(i), 0, 1, null));
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList2.add(MutableRange.Companion.fromRange((Range) list2.get(i2)));
                }
                onContentCardDismissed.RemoteActionCompatParcelizer((Iterable) arrayList2, (Collection) arrayList);
            }
            this.annotations.clear();
            this.annotations.addAll(arrayList);
        }

        public final <R> R withBulletListItem(BulletScope bulletScope, Bullet bullet, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
            Bullet bullet2;
            onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 = (onViewAttachedToWindowlambda0) onContentCardDismissed.MediaBrowserCompatMediaItem((List) bulletScope.getBulletListSettingStack$ui_text());
            long jM3876unboximpl = onviewattachedtowindowlambda0 != null ? ((TextUnit) onviewattachedtowindowlambda0.serializer).m3876unboximpl() : Bullet.Companion.m2893getDefaultIndentationXSAIIZE();
            if (bullet != null) {
                bullet2 = bullet;
            } else if (onviewattachedtowindowlambda0 == null || (bullet2 = (Bullet) onviewattachedtowindowlambda0.write) == null) {
                bullet2 = Bullet.Companion.getDefault();
            }
            int iPushStyle = bulletScope.getBuilder$ui_text().pushStyle(new ParagraphStyle(0, 0, 0L, new TextIndent(jM3876unboximpl, jM3876unboximpl, null), (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 503, (DefaultConstructorMarker) null));
            int iPushBullet = bulletScope.getBuilder$ui_text().pushBullet(bullet2);
            try {
                return (R) r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(bulletScope.getBuilder$ui_text());
            } finally {
                bulletScope.getBuilder$ui_text().pop(iPushBullet);
                bulletScope.getBuilder$ui_text().pop(iPushStyle);
            }
        }

        public Builder(int i) {
            this.text = new StringBuilder(i);
            this.styleStack = new ArrayList();
            this.annotations = new ArrayList();
            this.bulletScope = new BulletScope(this);
        }

        public static /* synthetic */ Object withBulletListItem$default(Builder builder, BulletScope bulletScope, Bullet bullet, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
            if ((i & 1) != 0) {
                bullet = null;
            }
            return builder.withBulletListItem(bulletScope, bullet, r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        }

        public final void addBullet(Bullet bullet, int i, int i2) {
            this.annotations.add(new MutableRange<>(bullet, i, i2, null, 8, null));
        }

        /* JADX INFO: renamed from: addBullet-r9BaKPg, reason: not valid java name */
        public final void m2883addBulletr9BaKPg(Bullet bullet, long j, int i, int i2) {
            this.annotations.add(new MutableRange<>(new ParagraphStyle(0, 0, 0L, new TextIndent(j, j, null), (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 503, (DefaultConstructorMarker) null), i, i2, null, 8, null));
            this.annotations.add(new MutableRange<>(bullet, i, i2, null, 8, null));
        }

        public final void addLink(LinkAnnotation.Url url, int i, int i2) {
            this.annotations.add(new MutableRange<>(url, i, i2, null, 8, null));
        }

        public final void addStyle(SpanStyle spanStyle, int i, int i2) {
            this.annotations.add(new MutableRange<>(spanStyle, i, i2, null, 8, null));
        }

        public final void addTtsAnnotation(TtsAnnotation ttsAnnotation, int i, int i2) {
            this.annotations.add(new MutableRange<>(ttsAnnotation, i, i2, null, 8, null));
        }

        @ExperimentalTextApi
        @onItemDismisslambda0
        public final void addUrlAnnotation(UrlAnnotation urlAnnotation, int i, int i2) {
            this.annotations.add(new MutableRange<>(urlAnnotation, i, i2, null, 8, null));
        }

        public final void addLink(LinkAnnotation.Clickable clickable, int i, int i2) {
            this.annotations.add(new MutableRange<>(clickable, i, i2, null, 8, null));
        }

        public final void addStyle(ParagraphStyle paragraphStyle, int i, int i2) {
            this.annotations.add(new MutableRange<>(paragraphStyle, i, i2, null, 8, null));
        }

        public Builder() {
            this(0, 1, null);
        }

        public /* synthetic */ Builder(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 16 : i);
        }

        public Builder(String str) {
            this(0, 1, null);
            append(str);
        }

        public Builder(AnnotatedString annotatedString) {
            this(0, 1, null);
            append(annotatedString);
        }

        public final int pushStyle(ParagraphStyle paragraphStyle) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(paragraphStyle, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final void pop() {
            if (this.styleStack.isEmpty()) {
                InlineClassHelperKt.throwIllegalStateException("Nothing to pop.");
            }
            List<MutableRange<? extends Object>> list = this.styleStack;
            list.remove(list.size() - 1).setEnd(this.text.length());
        }

        public final void append(String str) {
            this.text.append(str);
        }

        @Override // java.lang.Appendable
        public Builder append(CharSequence charSequence) {
            if (charSequence instanceof AnnotatedString) {
                append((AnnotatedString) charSequence);
                return this;
            }
            this.text.append(charSequence);
            return this;
        }

        @Override // java.lang.Appendable
        public Builder append(CharSequence charSequence, int i, int i2) {
            if (charSequence instanceof AnnotatedString) {
                append((AnnotatedString) charSequence, i, i2);
                return this;
            }
            this.text.append(charSequence, i, i2);
            return this;
        }

        @Override // java.lang.Appendable
        public Builder append(char c) {
            this.text.append(c);
            return this;
        }

        public final void append(AnnotatedString annotatedString) {
            int length = this.text.length();
            this.text.append(annotatedString.getText());
            List<Range<? extends Annotation>> annotations$ui_text = annotatedString.getAnnotations$ui_text();
            if (annotations$ui_text != null) {
                int size = annotations$ui_text.size();
                for (int i = 0; i < size; i++) {
                    Range<? extends Annotation> range = annotations$ui_text.get(i);
                    this.annotations.add(new MutableRange<>(range.getItem(), range.getStart() + length, range.getEnd() + length, range.getTag()));
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class ExhaustiveAnnotation implements Annotation {
    }

    public static final class Range<T> {
        public static final int $stable = 0;
        private final int end;
        private final T item;
        private final int start;
        private final String tag;

        public final T component1() {
            return this.item;
        }

        public final int component2() {
            return this.start;
        }

        public final int component3() {
            return this.end;
        }

        public final String component4() {
            return this.tag;
        }

        public final int getEnd() {
            return this.end;
        }

        public final T getItem() {
            return this.item;
        }

        public final int getStart() {
            return this.start;
        }

        public final String getTag() {
            return this.tag;
        }

        public final Range<T> copy(T t, int i, int i2, String str) {
            return new Range<>(t, i, i2, str);
        }

        public Range(T t, int i, int i2, String str) {
            this.item = t;
            this.start = i;
            this.end = i2;
            this.tag = str;
            if (i <= i2) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("Reversed range is not supported");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Range copy$default(Range range, Object obj, int i, int i2, String str, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                obj = range.item;
            }
            if ((i3 & 2) != 0) {
                i = range.start;
            }
            if ((i3 & 4) != 0) {
                i2 = range.end;
            }
            if ((i3 & 8) != 0) {
                str = range.tag;
            }
            return range.copy(obj, i, i2, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Range)) {
                return false;
            }
            Range range = (Range) obj;
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.item, range.item}, getCieXyz.write())).booleanValue() || this.start != range.start || this.end != range.end) {
                return false;
            }
            return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.tag, range.tag}, getCieXyz.write())).booleanValue();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Range(item=");
            sb.append(this.item);
            sb.append(", start=");
            sb.append(this.start);
            sb.append(", end=");
            sb.append(this.end);
            sb.append(", tag=");
            return ff$$ExternalSyntheticOutline0.m(sb, this.tag, ')');
        }

        public int hashCode() {
            T t = this.item;
            return this.tag.hashCode() + af$$ExternalSyntheticOutline0.m(this.end, af$$ExternalSyntheticOutline0.m(this.start, (t == null ? 0 : t.hashCode()) * 31, 31), 31);
        }

        public Range(T t, int i, int i2) {
            this(t, i, i2, "");
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return get(i);
    }

    public final List<Range<? extends Annotation>> getAnnotations$ui_text() {
        return this.annotations;
    }

    public final List<Range<ParagraphStyle>> getParagraphStylesOrNull$ui_text() {
        return this.paragraphStylesOrNull;
    }

    public final List<Range<SpanStyle>> getSpanStylesOrNull$ui_text() {
        return this.spanStylesOrNull;
    }

    public final String getText() {
        return this.text;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return getLength();
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text;
    }

    public final AnnotatedString flatMapAnnotations(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Builder builder = new Builder(this);
        builder.flatMapAnnotations$ui_text(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        return builder.toAnnotatedString();
    }

    public char get(int i) {
        return this.text.charAt(i);
    }

    public int getLength() {
        return this.text.length();
    }

    public final boolean hasEqualAnnotations(AnnotatedString annotatedString) {
        Object[] objArr = {this.annotations, annotatedString.annotations};
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue();
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode();
        List<Range<? extends Annotation>> list = this.annotations;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    public final AnnotatedString mapAnnotations(r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        Builder builder = new Builder(this);
        builder.mapAnnotations$ui_text(r8lambdaunavo3sxub_pc9xroryotnrlvsm);
        return builder.toAnnotatedString();
    }

    public final AnnotatedString plus(AnnotatedString annotatedString) {
        Builder builder = new Builder(this);
        builder.append(annotatedString);
        return builder.toAnnotatedString();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final invalidateShadow getSaver() {
            return AnnotatedString.Saver;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotatedString(List<? extends Range<? extends Annotation>> list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.annotations = list;
        this.text = str;
        if (list != 0) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                Range<SpanStyle> range = (Range) list.get(i);
                if (range.getItem() instanceof SpanStyle) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(range);
                } else if (range.getItem() instanceof ParagraphStyle) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(range);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.spanStylesOrNull = arrayList;
        this.paragraphStylesOrNull = arrayList2;
        List listSerializer = arrayList2 != null ? onContentCardDismissed.serializer(arrayList2, new Comparator() { // from class: androidx.compose.ui.text.AnnotatedString$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return setNativeShader.RemoteActionCompatParcelizer(Integer.valueOf(((AnnotatedString.Range) t).getStart()), Integer.valueOf(((AnnotatedString.Range) t2).getStart()));
            }
        }) : null;
        List list2 = listSerializer;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        int end = ((Range) onContentCardDismissed.read(listSerializer)).getEnd();
        AnchoredDraggableKt anchoredDraggableKt = ContextMenuScope.write;
        AnchoredDraggableKt anchoredDraggableKt2 = new AnchoredDraggableKt(1);
        anchoredDraggableKt2.IconCompatParcelizer(end);
        int size2 = listSerializer.size();
        for (int i2 = 1; i2 < size2; i2++) {
            Range range2 = (Range) listSerializer.get(i2);
            while (anchoredDraggableKt2.RemoteActionCompatParcelizer != 0) {
                int i3 = anchoredDraggableKt2.read();
                if (range2.getStart() < i3) {
                    if (range2.getEnd() > i3) {
                        InlineClassHelperKt.throwIllegalArgumentException("Paragraph overlap not allowed, end " + range2.getEnd() + " should be less than or equal to " + i3);
                        break;
                    }
                    break;
                }
                anchoredDraggableKt2.read(anchoredDraggableKt2.RemoteActionCompatParcelizer - 1);
            }
            anchoredDraggableKt2.IconCompatParcelizer(range2.getEnd());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnotatedString)) {
            return false;
        }
        AnnotatedString annotatedString = (AnnotatedString) obj;
        if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.text, annotatedString.text}, getCieXyz.write())).booleanValue()) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.annotations, annotatedString.annotations}, getCieXyz.write())).booleanValue();
    }

    public final List<Range<ParagraphStyle>> getParagraphStyles() {
        List<Range<ParagraphStyle>> list = this.paragraphStylesOrNull;
        return list == null ? instance_delegatelambda0.write : list;
    }

    public final List<Range<SpanStyle>> getSpanStyles() {
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        return list == null ? instance_delegatelambda0.write : list;
    }

    /* JADX INFO: renamed from: subSequence-5zc-tL8, reason: not valid java name */
    public final AnnotatedString m2881subSequence5zctL8(long j) {
        return subSequence(TextRange.m3074getMinimpl(j), TextRange.m3073getMaximpl(j));
    }

    public final List<Range<LinkAnnotation>> getLinkAnnotations(int i, int i2) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list == null) {
            return instance_delegatelambda0.write;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Range<? extends Annotation> range = list.get(i3);
            Range<? extends Annotation> range2 = range;
            if ((range2.getItem() instanceof LinkAnnotation) && AnnotatedStringKt.intersect(i, i2, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        return arrayList;
    }

    public final List<Range<String>> getStringAnnotations(String str, int i, int i2) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list == null) {
            return instance_delegatelambda0.write;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Range<? extends Annotation> range = list.get(i3);
            if (range.getItem() instanceof StringAnnotation) {
                Object[] objArr = {str, range.getTag()};
                if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), objArr, getCieXyz.write())).booleanValue()) {
                    if (AnnotatedStringKt.intersect(i, i2, range.getStart(), range.getEnd())) {
                        arrayList.add(StringAnnotationKt.unbox(range));
                    }
                }
            }
        }
        return arrayList;
    }

    public final List<Range<TtsAnnotation>> getTtsAnnotations(int i, int i2) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list == null) {
            return instance_delegatelambda0.write;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Range<? extends Annotation> range = list.get(i3);
            Range<? extends Annotation> range2 = range;
            if ((range2.getItem() instanceof TtsAnnotation) && AnnotatedStringKt.intersect(i, i2, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        return arrayList;
    }

    @ExperimentalTextApi
    @onItemDismisslambda0
    public final List<Range<UrlAnnotation>> getUrlAnnotations(int i, int i2) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list == null) {
            return instance_delegatelambda0.write;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Range<? extends Annotation> range = list.get(i3);
            Range<? extends Annotation> range2 = range;
            if ((range2.getItem() instanceof UrlAnnotation) && AnnotatedStringKt.intersect(i, i2, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        return arrayList;
    }

    public final boolean hasLinkAnnotations(int i, int i2) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Range<? extends Annotation> range = list.get(i3);
                if ((range.getItem() instanceof LinkAnnotation) && AnnotatedStringKt.intersect(i, i2, range.getStart(), range.getEnd())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean hasStringAnnotations(String str, int i, int i2) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Range<? extends Annotation> range = list.get(i3);
                if (range.getItem() instanceof StringAnnotation) {
                    if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{str, range.getTag()}, getCieXyz.write())).booleanValue()) {
                        if (AnnotatedStringKt.intersect(i, i2, range.getStart(), range.getEnd())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // java.lang.CharSequence
    public AnnotatedString subSequence(int i, int i2) {
        if (i > i2) {
            InlineClassHelperKt.throwIllegalArgumentException("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        if (i == 0 && i2 == this.text.length()) {
            return this;
        }
        return new AnnotatedString((List<? extends Range<? extends Annotation>>) AnnotatedStringKt.filterRanges(this.annotations, i, i2), this.text.substring(i, i2));
    }

    public final List<Range<String>> getStringAnnotations(int i, int i2) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                Range<? extends Annotation> range = list.get(i3);
                if ((range.getItem() instanceof StringAnnotation) && AnnotatedStringKt.intersect(i, i2, range.getStart(), range.getEnd())) {
                    arrayList.add(StringAnnotationKt.unbox(range));
                }
            }
            return arrayList;
        }
        return instance_delegatelambda0.write;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AnnotatedString(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        this(str, (i & 2) != 0 ? instance_delegatelambda0Var : list, (i & 4) != 0 ? instance_delegatelambda0Var : list2);
    }

    public AnnotatedString(String str, List<Range<SpanStyle>> list, List<Range<ParagraphStyle>> list2) {
        this((List<? extends Range<? extends Annotation>>) AnnotatedStringKt.constructAnnotationsFromSpansAndParagraphs(list, list2), str);
    }

    public /* synthetic */ AnnotatedString(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (List<? extends Range<? extends Annotation>>) ((i & 2) != 0 ? instance_delegatelambda0.write : list));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AnnotatedString(String str, List<? extends Range<? extends Annotation>> list) {
        List<? extends Range<? extends Annotation>> list2 = list;
        this(list2.isEmpty() ? null : list2, str);
    }
}
