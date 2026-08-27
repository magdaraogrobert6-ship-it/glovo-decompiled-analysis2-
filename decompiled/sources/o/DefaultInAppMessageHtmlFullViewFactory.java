package o;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyKt__LazyJVMKt;
import kotlinx.serialization.SealedClassSerializer$$ExternalSyntheticLambda0;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;

/* JADX INFO: loaded from: classes4.dex */
public final class DefaultInAppMessageHtmlFullViewFactory extends AbstractPolymorphicSerializer {
    public final onViewDetachedFromWindowlambda1 IconCompatParcelizer;
    public final List RemoteActionCompatParcelizer;
    public final LinkedHashMap read;
    public final r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk serializer;
    public final Map write;

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public final getUnregisteredInAppMessageannotations read() {
        return this.serializer;
    }

    @Override // o.setGraphicModalMaxWidthDp
    public final r8lambda92M0P9sIT5Uf70mvjF4RwMruDA getDescriptor() {
        return (r8lambda92M0P9sIT5Uf70mvjF4RwMruDA) this.IconCompatParcelizer.MediaSessionCompatResultReceiverWrapper();
    }

    public DefaultInAppMessageHtmlFullViewFactory(String str, r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, getUnregisteredInAppMessageannotations[] getunregisteredinappmessageannotationsArr, setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr) {
        this.serializer = r8lambdaucgighn8fiyv_vccodeafjfpedk;
        this.RemoteActionCompatParcelizer = instance_delegatelambda0.write;
        int i = 0;
        this.IconCompatParcelizer = LazyKt__LazyJVMKt.serializer(onViewDetachedFromWindowlambda0.PUBLICATION, new SealedClassSerializer$$ExternalSyntheticLambda0(str, i, this));
        if (getunregisteredinappmessageannotationsArr.length != setgraphicmodalmaxwidthdpArr.length) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read("All subclasses of sealed class ", r8lambdaucgighn8fiyv_vccodeafjfpedk.IconCompatParcelizer(), " should be marked @Serializable");
            throw null;
        }
        int iMin = Math.min(getunregisteredinappmessageannotationsArr.length, setgraphicmodalmaxwidthdpArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        while (i < iMin) {
            arrayList.add(new onViewAttachedToWindowlambda0(getunregisteredinappmessageannotationsArr[i], setgraphicmodalmaxwidthdpArr[i]));
            i++;
        }
        Map mapSerializer = onMove.serializer(arrayList);
        this.write = mapSerializer;
        Set<Map.Entry> setEntrySet = mapSerializer.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            String strSerializer = ((setGraphicModalMaxWidthDp) entry.getValue()).getDescriptor().serializer();
            Object obj = linkedHashMap.get(strSerializer);
            if (obj == null) {
                linkedHashMap.containsKey(strSerializer);
            }
            Map.Entry entry2 = (Map.Entry) obj;
            if (entry2 != null) {
                StringBuilder sb = new StringBuilder("Multiple sealed subclasses of '");
                sb.append(this.serializer);
                sb.append("' have the same serial name '");
                sb.append(strSerializer);
                sb.append("': '");
                sb.append(entry2.getKey());
                Object key = entry.getKey();
                sb.append("', '");
                sb.append(key);
                sb.append('\'');
                throw new IllegalStateException(sb.toString().toString());
            }
            linkedHashMap.put(strSerializer, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(onMove.RemoteActionCompatParcelizer(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (setGraphicModalMaxWidthDp) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.read = linkedHashMap2;
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public final setGraphicModalMaxWidthDp serializer(DefaultInAppMessageViewWrapperFactory defaultInAppMessageViewWrapperFactory, Object obj) {
        obj.getClass();
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdpSerializer = (setGraphicModalMaxWidthDp) this.write.get(displayInAppMessagelambda1.serializer(obj.getClass()));
        if (setgraphicmodalmaxwidthdpSerializer == null) {
            setgraphicmodalmaxwidthdpSerializer = super.serializer(defaultInAppMessageViewWrapperFactory, obj);
        }
        if (setgraphicmodalmaxwidthdpSerializer != null) {
            return setgraphicmodalmaxwidthdpSerializer;
        }
        return null;
    }

    @Override // kotlinx.serialization.internal.AbstractPolymorphicSerializer
    public final setGraphicModalMaxWidthDp read(createInAppMessageViewlambda1 createinappmessageviewlambda1, String str) {
        setGraphicModalMaxWidthDp setgraphicmodalmaxwidthdp = (setGraphicModalMaxWidthDp) this.read.get(str);
        return setgraphicmodalmaxwidthdp != null ? setgraphicmodalmaxwidthdp : super.read(createinappmessageviewlambda1, str);
    }

    public DefaultInAppMessageHtmlFullViewFactory(String str, r8lambdaucGIgHn8fIyV_vccOdEafjFpEdk r8lambdaucgighn8fiyv_vccodeafjfpedk, getUnregisteredInAppMessageannotations[] getunregisteredinappmessageannotationsArr, setGraphicModalMaxWidthDp[] setgraphicmodalmaxwidthdpArr, Annotation[] annotationArr) {
        this(str, r8lambdaucgighn8fiyv_vccodeafjfpedk, getunregisteredinappmessageannotationsArr, setgraphicmodalmaxwidthdpArr);
        List listAsList = Arrays.asList(annotationArr);
        listAsList.getClass();
        this.RemoteActionCompatParcelizer = listAsList;
    }
}
