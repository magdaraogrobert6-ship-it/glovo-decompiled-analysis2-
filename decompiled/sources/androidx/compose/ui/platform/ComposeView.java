package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.CompositionKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.ContentType_androidKt;
import o.PopulateViewStructure_androidKtpopulate7;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getHandleruiannotations;
import o.getPostalCode;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;

/* JADX INFO: loaded from: classes.dex */
public final class ComposeView extends AbstractComposeView {
    private final PopulateViewStructure_androidKtpopulate7 content;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void setContent(r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0) {
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.content.setValue(r8lambdaa6_tctqmksh3fk6hjgcbkuvde0);
        if (isAttachedToWindow() || getComposeViewContext$ui() != null) {
            createComposition();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void Content(getBirthDateFull getbirthdatefull, final int i) {
        int i2;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(420213850);
        if ((i & 6) == 0) {
            i2 = (getpostalcode.IconCompatParcelizer(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (getpostalcode.write(i2 & 1, (i2 & 3) != 2)) {
            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 = (r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0) this.content.getValue();
            if (r8lambdaa6_tctqmksh3fk6hjgcbkuvde0 == null) {
                getpostalcode.serializer(-1238823553);
            } else {
                getpostalcode.serializer(98585282);
                r8lambdaa6_tctqmksh3fk6hjgcbkuvde0.invoke(getpostalcode, 0);
            }
            getpostalcode.IconCompatParcelizer(false);
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        }
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.ui.platform.ComposeView.Content.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((getBirthDateFull) obj, ((Number) obj2).intValue());
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(getBirthDateFull getbirthdatefull2, int i3) {
                    ComposeView.this.Content(getbirthdatefull2, ContentType_androidKt.RemoteActionCompatParcelizer(i | 1));
                }
            };
        }
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.content = CompositionKt.RemoteActionCompatParcelizer(null);
    }

    public ComposeView(Context context) {
        this(context, null, 0, 6, null);
    }
}
