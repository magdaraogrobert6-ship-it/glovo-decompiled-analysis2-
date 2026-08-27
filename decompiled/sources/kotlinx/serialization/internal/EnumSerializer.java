package kotlinx.serialization.internal;

import androidx.compose.ui.graphics.Fields;
import bo.app.c8$$ExternalSyntheticOutline0;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda0;
import kotlinx.serialization.SerializationException;
import o.DefaultInAppMessageModalViewFactoryCompanion;
import o.DefaultInAppMessageViewWrapperFactory;
import o.DrawableTransformation;
import o.InAppMessageJavascriptInterfaceCompanion;
import o.SwipeDismissTouchListenerVerticalDismissDirection;
import o.TouchAwareSwipeDismissTouchListener;
import o.createInAppMessageViewlambda1;
import o.instance_delegatelambda0;
import o.isAdapterPositionOnScreen;
import o.onContentCardClicked;
import o.onViewDetachedFromWindowlambda0;
import o.onViewDetachedFromWindowlambda1;
import o.r8lambda92M0P9sIT5Uf70mvjF4RwMruDA;
import o.requestDisallowParentIntercept;
import o.setGraphicModalMaxWidthDp;
import o.setTouchListener;
import o.setWasCloseMessageCalled;

/* JADX INFO: loaded from: classes4.dex */
public final class EnumSerializer implements setGraphicModalMaxWidthDp {
    private static int MediaSessionCompatQueueItem = 1;
    private static int read;
    public final /* synthetic */ int IconCompatParcelizer = 2;
    public final Object RemoteActionCompatParcelizer;
    public final Object serializer;
    public Object write;

    public EnumSerializer(String str, Object obj) {
        obj.getClass();
        this.serializer = obj;
        this.write = instance_delegatelambda0.write;
        this.RemoteActionCompatParcelizer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new SealedClassSerializer$$ExternalSyntheticLambda0(str, 20, this));
    }

    public EnumSerializer(setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp) {
        setgraphicmodalmaxwidthdp.getClass();
        this.serializer = setgraphicmodalmaxwidthdp;
        setWasCloseMessageCalled setwasclosemessagecalled = new setWasCloseMessageCalled(setgraphicmodalmaxwidthdp, 0);
        this.write = setwasclosemessagecalled;
        this.RemoteActionCompatParcelizer = (InAppMessageJavascriptInterfaceCompanion) setwasclosemessagecalled.write;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        int i = 2 % 2;
        int i2 = read + 123;
        int i3 = i2 % Fields.SpotShadowColor;
        MediaSessionCompatQueueItem = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = this.IconCompatParcelizer;
        if (i4 == 0) {
            return (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) ((isAdapterPositionOnScreen) this.RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper();
        }
        if (i4 != 1) {
            return (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) ((onViewDetachedFromWindowlambda1) this.RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper();
        }
        r8lambda92M0P9sIT5Uf70mvjF4RwMruDA r8lambda92m0p9sit5uf70mvjf4rwmruda = (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) this.RemoteActionCompatParcelizer;
        int i5 = i3 + 5;
        read = i5 % Fields.SpotShadowColor;
        if (i5 % 2 == 0) {
            return r8lambda92m0p9sit5uf70mvjf4rwmruda;
        }
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EnumSerializer(String str, Object obj, Annotation[] annotationArr) {
        this(str, obj);
        obj.getClass();
        List listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.write = listAsList;
    }

    public String toString() {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 85;
        read = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        if (this.IconCompatParcelizer != 0) {
            String string = super.toString();
            int i4 = MediaSessionCompatQueueItem + 123;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return string;
        }
        String str = "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().serializer() + '>';
        int i6 = MediaSessionCompatQueueItem + 27;
        read = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return str;
    }

    public EnumSerializer(String str, Enum[] enumArr) {
        enumArr.getClass();
        this.serializer = enumArr;
        this.RemoteActionCompatParcelizer = new isAdapterPositionOnScreen(new SealedClassSerializer$$ExternalSyntheticLambda0(this, str));
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final void serialize(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        int i = 2 % 2;
        int i2 = MediaSessionCompatQueueItem + 83;
        read = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.IconCompatParcelizer;
        if (i3 != 0) {
            if (i3 == 1) {
                List list = (List) obj;
                list.getClass();
                ((setWasCloseMessageCalled) this.write).serialize(defaultInAppMessageViewWrapperFactory, list);
                return;
            } else {
                obj.getClass();
                defaultInAppMessageViewWrapperFactory.serializer(getDescriptor()).IconCompatParcelizer(getDescriptor());
                int i4 = read + 21;
                MediaSessionCompatQueueItem = i4 % Fields.SpotShadowColor;
                int i5 = i4 % 2;
                return;
            }
        }
        Enum r6 = (Enum) obj;
        r6.getClass();
        Enum[] enumArr = (Enum[]) this.serializer;
        int i6 = onContentCardClicked.read(enumArr, r6);
        if (i6 != -1) {
            defaultInAppMessageViewWrapperFactory.read(getDescriptor(), i6);
            int i7 = MediaSessionCompatQueueItem + 73;
            read = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r6);
        String strSerializer = getDescriptor().serializer();
        String string = Arrays.toString(enumArr);
        string.getClass();
        sb.append(" is not a valid enum ");
        sb.append(strSerializer);
        sb.append(", must be one of ");
        sb.append(string);
        throw new SerializationException(sb.toString());
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final Object deserialize(DefaultInAppMessageModalViewFactoryCompanion defaultInAppMessageModalViewFactoryCompanion) {
        Object objIconCompatParcelizer;
        int i = 2 % 2;
        int i2 = read + 35;
        MediaSessionCompatQueueItem = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.IconCompatParcelizer;
        Object obj = this.serializer;
        if (i4 == 0) {
            Enum[] enumArr = (Enum[]) obj;
            int iIconCompatParcelizer = defaultInAppMessageModalViewFactoryCompanion.IconCompatParcelizer(getDescriptor());
            if (iIconCompatParcelizer >= 0 && iIconCompatParcelizer < enumArr.length) {
                return enumArr[iIconCompatParcelizer];
            }
            throw new SerializationException(iIconCompatParcelizer + " is not among valid " + getDescriptor().serializer() + " enum values, values size is " + enumArr.length);
        }
        if (i4 != 1) {
            r8lambda92M0P9sIT5Uf70mvjF4RwMruDA descriptor = getDescriptor();
            createInAppMessageViewlambda1 createinappmessageviewlambda1Serializer = defaultInAppMessageModalViewFactoryCompanion.serializer(descriptor);
            createinappmessageviewlambda1Serializer.getClass();
            int i5 = createinappmessageviewlambda1Serializer.read(getDescriptor());
            if (i5 == -1) {
                createinappmessageviewlambda1Serializer.write(descriptor);
            } else {
                DrawableTransformation.serializer(c8$$ExternalSyntheticOutline0.m(i5, "Unexpected index "));
                obj = null;
            }
            int i6 = MediaSessionCompatQueueItem + 31;
            read = i6 % Fields.SpotShadowColor;
            int i7 = i6 % 2;
            return obj;
        }
        setTouchListener settouchlistener = (setTouchListener) defaultInAppMessageModalViewFactoryCompanion;
        try {
            requestDisallowParentIntercept requestdisallowparentinterceptIconCompatParcelizer = TouchAwareSwipeDismissTouchListener.IconCompatParcelizer(settouchlistener.read());
            ArrayList arrayList = new ArrayList();
            Iterator it = requestdisallowparentinterceptIconCompatParcelizer.content.iterator();
            while (it.hasNext()) {
                int i8 = read + 81;
                MediaSessionCompatQueueItem = i8 % Fields.SpotShadowColor;
                int i9 = i8 % 2;
                try {
                    setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) obj;
                    objIconCompatParcelizer = settouchlistener.serializer().IconCompatParcelizer(setgraphicmodalmaxwidthdp, (SwipeDismissTouchListenerVerticalDismissDirection) it.next());
                } catch (SerializationException unused) {
                    objIconCompatParcelizer = null;
                }
                if (objIconCompatParcelizer != null) {
                    int i10 = read + 71;
                    MediaSessionCompatQueueItem = i10 % Fields.SpotShadowColor;
                    int i11 = i10 % 2;
                    arrayList.add(objIconCompatParcelizer);
                }
            }
            return arrayList;
        } catch (Exception unused2) {
            return instance_delegatelambda0.write;
        }
    }
}
