package androidx.compose.ui.tooling.data;

import androidx.compose.runtime.tooling.SourceInformationKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.LayoutInfo;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.unit.IntRect;
import androidx.sqlite.SQLite;
import com.braze.IBraze$$ExternalSyntheticBUOutline0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.math.MathKt;
import kotlin.text.MatcherMatchResult$groups$1;
import o.BlurredEdgeTreatmentCompanion;
import o.CacheDrawModifierNode;
import o.CacheDrawModifierNodeImpl1;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.getInAppMessageEventMap;
import o.getInAppMessageStack;
import o.getIsCurrentlyDisplayingInAppMessage;
import o.getOrBuildCachedDrawBlock;
import o.hideCurrentlyDisplayingInAppMessage;
import o.instance_delegatelambda0;
import o.onContentCardDismissed;
import o.onMeasureResultChanged;
import o.r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.removeNodeAtDepth;
import o.setCarryoverInAppMessage;
import o.setNativeShader;

/* JADX INFO: loaded from: classes.dex */
public final class SlotTreeKt {
    private static final int BITS_PER_SLOT = 3;
    private static final int SLOT_MASK = 7;
    private static final int STABLE_BITS = 4;
    private static final int STATIC_BITS = 3;
    private static final String changedFieldName = "$$changed";
    private static final String defaultFieldName = "$$default";
    private static final String internalFieldPrefix = "$$";
    private static final String jacocoDataField = "$jacoco";
    private static final String parameterPrefix = "$";
    private static final String recomposeScopeNameSuffix = ".RecomposeScopeImpl";
    private static final IntRect emptyBox = new IntRect(0, 0, 0, 0);
    private static final getInAppMessageEventMap indyLambdaRegex = new getInAppMessageEventMap("^f\\$\\d+$");
    private static final getInAppMessageEventMap legacyLambdaRegex = new getInAppMessageEventMap("^\\$([^$]+)$|\\$\\$.*?\\$-([^$]+)\\$\\d+$");

    @UiToolingDataApi
    private static final ParameterInformation buildParameterInfo(Field field, Object obj, int i, int i2, int i3, onMeasureResultChanged onmeasureresultchanged) throws IllegalAccessException {
        String str;
        field.setAccessible(true);
        Object obj2 = field.get(obj);
        boolean z = ((1 << i) & i2) != 0;
        int i4 = (i * 3) + 1;
        int i5 = (i3 & (7 << i4)) >> i4;
        int i6 = i5 & 3;
        boolean z2 = i6 == 3;
        boolean z3 = i6 == 0;
        return new ParameterInformation((onmeasureresultchanged == null || (str = onmeasureresultchanged.RemoteActionCompatParcelizer) == null) ? field.getName().substring(1) : str, obj2, z, z2, z3 && !z, onmeasureresultchanged != null ? onmeasureresultchanged.serializer : null, (i5 & 4) == 0);
    }

    public static final IntRect getEmptyBox() {
        return emptyBox;
    }

    @UiToolingDataApi
    public static /* synthetic */ void getPosition$annotations(Group group) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object mapTree$lambda$0(r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, getOrBuildCachedDrawBlock getorbuildcacheddrawblock, SourceContext sourceContext, List list, List list2) {
        return r8lambdafjq9b8d5osr_i2bajdxqnw6rnry.invoke(getorbuildcacheddrawblock, sourceContext, list);
    }

    private static final List<ParameterInformation> extractFromLegacyFields(List<Field> list, Object obj, List<onMeasureResultChanged> list2) throws IllegalAccessException {
        Field field;
        ParameterInformation parameterInformationBuildParameterInfo;
        Object next;
        Class<?> cls = obj.getClass();
        Field fieldAccessibleField = accessibleField(cls, defaultFieldName);
        Object obj2 = fieldAccessibleField != null ? fieldAccessibleField.get(obj) : null;
        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
        int iIntValue = num != null ? num.intValue() : 0;
        Field fieldAccessibleField2 = accessibleField(cls, changedFieldName);
        Object obj3 = fieldAccessibleField2 != null ? fieldAccessibleField2.get(obj) : null;
        Integer num2 = obj3 instanceof Integer ? (Integer) obj3 : null;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        List<Field> list3 = list;
        List listSerializer = onContentCardDismissed.serializer(list3, new Comparator() { // from class: androidx.compose.ui.tooling.data.SlotTreeKt$extractFromLegacyFields$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return setNativeShader.RemoteActionCompatParcelizer((Comparable) SlotTreeKt.extractFromLegacyFields$extractedName((Field) t), (Comparable) SlotTreeKt.extractFromLegacyFields$extractedName((Field) t2));
            }
        });
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj4 : list3) {
            if (i < 0) {
                SQLite.serializer();
                throw null;
            }
            onMeasureResultChanged onmeasureresultchanged = (onMeasureResultChanged) onContentCardDismissed.read(i, list2);
            if (onmeasureresultchanged == null) {
                onmeasureresultchanged = new onMeasureResultChanged(i, 6, (String) null);
            }
            String str = onmeasureresultchanged.RemoteActionCompatParcelizer;
            int i2 = onmeasureresultchanged.write;
            if (i2 >= list.size()) {
                parameterInformationBuildParameterInfo = null;
            } else {
                if (str != null) {
                    Iterator<T> it = list3.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!str.equals(extractFromLegacyFields$extractedName((Field) next)));
                    field = (Field) next;
                } else {
                    field = null;
                }
                Field field2 = field == null ? (Field) listSerializer.get(i2) : field;
                parameterInformationBuildParameterInfo = buildParameterInfo(field2, obj, i, iIntValue, iIntValue2, str == null ? new onMeasureResultChanged(i2, extractFromLegacyFields$extractedName(field2), onmeasureresultchanged.serializer) : onmeasureresultchanged);
            }
            if (parameterInformationBuildParameterInfo != null) {
                arrayList.add(parameterInformationBuildParameterInfo);
            }
            i++;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String extractFromLegacyFields$extractedName(Field field) {
        getInAppMessageStack getinappmessagestackRemoteActionCompatParcelizer;
        getIsCurrentlyDisplayingInAppMessage getiscurrentlydisplayinginappmessage = getInAppMessageEventMap.read(legacyLambdaRegex, field.getName());
        MatcherMatchResult$groups$1 matcherMatchResult$groups$1 = getiscurrentlydisplayinginappmessage != null ? getiscurrentlydisplayinginappmessage.write : null;
        if (matcherMatchResult$groups$1 == null || (getinappmessagestackRemoteActionCompatParcelizer = matcherMatchResult$groups$1.RemoteActionCompatParcelizer(1)) == null) {
            getinappmessagestackRemoteActionCompatParcelizer = matcherMatchResult$groups$1 != null ? matcherMatchResult$groups$1.RemoteActionCompatParcelizer(2) : null;
        }
        if (getinappmessagestackRemoteActionCompatParcelizer != null) {
            return getinappmessagestackRemoteActionCompatParcelizer.RemoteActionCompatParcelizer;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @UiToolingDataApi
    public static final List<ParameterInformation> extractParameterInfo(List<? extends Object> list, SourceInformationContext sourceInformationContext) {
        Object next;
        Field fieldAccessibleField;
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next != null && setCarryoverInAppMessage.read(next.getClass().getName(), recomposeScopeNameSuffix, false)) {
                break;
            }
        }
        instance_delegatelambda0 instance_delegatelambda0Var = instance_delegatelambda0.write;
        if (next == null || (fieldAccessibleField = accessibleField(next.getClass(), "block")) == null || (obj = fieldAccessibleField.get(next)) == null) {
            return instance_delegatelambda0Var;
        }
        List<onMeasureResultChanged> parameters = sourceInformationContext != null ? sourceInformationContext.getParameters() : null;
        if (parameters == null) {
            parameters = instance_delegatelambda0Var;
        }
        Class<?> cls = obj.getClass();
        try {
            List<Field> listFilterParameterFields = filterParameterFields(cls.getDeclaredFields(), true);
            return !listFilterParameterFields.isEmpty() ? extractFromIndyLambdaFields(listFilterParameterFields, obj, parameters) : extractFromLegacyFields(filterParameterFields(cls.getDeclaredFields(), false), obj, parameters);
        } catch (Exception unused) {
            return instance_delegatelambda0Var;
        }
    }

    private static final List<Field> filterParameterFields(Field[] fieldArr, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (Field field : fieldArr) {
            String name = field.getName();
            if ((z ? indyLambdaRegex.read(name) : legacyLambdaRegex.read(name)) && !setCarryoverInAppMessage.RemoteActionCompatParcelizer(name, jacocoDataField, false)) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }

    public static final IntRect union(IntRect intRect, IntRect intRect2) {
        IntRect intRect3 = emptyBox;
        int iWrite = getCieXyz.write();
        int iWrite2 = getCieXyz.write();
        int iWrite3 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{intRect, intRect3}, iWrite3)).booleanValue()) {
            return intRect2;
        }
        int iWrite4 = getCieXyz.write();
        int iWrite5 = getCieXyz.write();
        int iWrite6 = getCieXyz.write();
        if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite4, 1803334089, -1803334089, getCieXyz.write(), iWrite5, new Object[]{intRect2, intRect3}, iWrite6)).booleanValue()) {
            return intRect;
        }
        return new IntRect(Math.min(intRect.getLeft(), intRect2.getLeft()), Math.min(intRect.getTop(), intRect2.getTop()), Math.max(intRect.getRight(), intRect2.getRight()), Math.max(intRect.getBottom(), intRect2.getBottom()));
    }

    private static final Field accessibleField(Class<?> cls, String str) {
        Field field;
        Field[] declaredFields = cls.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                field = null;
                break;
            }
            field = declaredFields[i];
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{field.getName(), str}, getCieXyz.write())).booleanValue()) {
                break;
            }
            i++;
        }
        if (field == null) {
            return null;
        }
        field.setAccessible(true);
        return field;
    }

    @UiToolingDataApi
    public static final Group asTree(BlurredEdgeTreatmentCompanion blurredEdgeTreatmentCompanion) {
        Group group;
        getOrBuildCachedDrawBlock getorbuildcacheddrawblock = (getOrBuildCachedDrawBlock) onContentCardDismissed.serializer(blurredEdgeTreatmentCompanion.write());
        return (getorbuildcacheddrawblock == null || (group = getGroup(getorbuildcacheddrawblock, null)) == null) ? EmptyGroup.INSTANCE : group;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRect boundsOfLayoutNode(LayoutInfo layoutInfo) {
        LayoutCoordinates coordinates = layoutInfo.getCoordinates();
        if (!layoutInfo.isAttached() || !coordinates.isAttached()) {
            return new IntRect(0, 0, layoutInfo.getWidth(), layoutInfo.getHeight());
        }
        long jPositionInWindow = LayoutCoordinatesKt.positionInWindow(coordinates);
        if ((((InlineClassHelperKt.DualUnsignedFloatMask & jPositionInWindow) + InlineClassHelperKt.DualLoadedSignificand) & (-9223372034707292160L)) != 0) {
            return new IntRect(0, 0, layoutInfo.getWidth(), layoutInfo.getHeight());
        }
        long jMo2217getSizeYbymL2g = coordinates.mo2217getSizeYbymL2g();
        int iWrite = MathKt.write(Float.intBitsToFloat((int) (jPositionInWindow >> 32)));
        int iWrite2 = MathKt.write(Float.intBitsToFloat((int) (jPositionInWindow & 4294967295L)));
        return new IntRect(iWrite, iWrite2, ((int) (jMo2217getSizeYbymL2g >> 32)) + iWrite, ((int) (jMo2217getSizeYbymL2g & 4294967295L)) + iWrite2);
    }

    private static final List<ParameterInformation> extractFromIndyLambdaFields(List<Field> list, Object obj, List<onMeasureResultChanged> list2) {
        boolean z;
        Object next;
        List listSerializer = onContentCardDismissed.serializer(list, new Comparator() { // from class: androidx.compose.ui.tooling.data.SlotTreeKt$extractFromIndyLambdaFields$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                String name = ((Field) t).getName();
                Integer numMediaSessionCompatQueueItem = setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(name, "f$", name));
                int iIntValue = numMediaSessionCompatQueueItem != null ? numMediaSessionCompatQueueItem.intValue() : Integer.MAX_VALUE;
                String name2 = ((Field) t2).getName();
                Integer numMediaSessionCompatQueueItem2 = setCarryoverInAppMessage.MediaSessionCompatQueueItem(10, hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(name2, "f$", name2));
                return setNativeShader.RemoteActionCompatParcelizer(Integer.valueOf(iIntValue), Integer.valueOf(numMediaSessionCompatQueueItem2 != null ? numMediaSessionCompatQueueItem2.intValue() : Integer.MAX_VALUE));
            }
        });
        if (list2.isEmpty()) {
            z = true;
        } else {
            List<onMeasureResultChanged> list3 = list2;
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it = list3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((onMeasureResultChanged) it.next()).RemoteActionCompatParcelizer != null) {
                            z = true;
                        }
                    }
                }
            }
            z = false;
        }
        List list4 = z ? onContentCardDismissed.read(listSerializer, list2.size()) : listSerializer;
        int size = z ? list2.size() : listSerializer.size();
        Field field = (Field) onContentCardDismissed.read(size, listSerializer);
        Object obj2 = field != null ? field.get(obj) : null;
        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
        int iIntValue = num != null ? num.intValue() : 0;
        Field field2 = (Field) onContentCardDismissed.read(size + 1, listSerializer);
        Object obj3 = field2 != null ? field2.get(obj) : null;
        Integer num2 = obj3 instanceof Integer ? (Integer) obj3 : null;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        List list5 = list4;
        ArrayList arrayList = new ArrayList(accessgetInstancedelegatecp.write(list5, 10));
        int i = 0;
        for (Object obj4 : list5) {
            int i2 = i + 1;
            if (i < 0) {
                SQLite.serializer();
                throw null;
            }
            Field field3 = (Field) obj4;
            Iterator<T> it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (((onMeasureResultChanged) next).write != i);
            arrayList.add(buildParameterInfo(field3, obj, i, iIntValue2, iIntValue, (onMeasureResultChanged) next));
            i = i2;
        }
        return arrayList;
    }

    @UiToolingDataApi
    private static final Group getGroup(getOrBuildCachedDrawBlock getorbuildcacheddrawblock, SourceInformationContext sourceInformationContext) {
        IntRect intRectBoundsOfLayoutNode;
        Object objIconCompatParcelizer = getorbuildcacheddrawblock.IconCompatParcelizer();
        String strMediaMetadataCompat = getorbuildcacheddrawblock.MediaMetadataCompat();
        SourceInformationContext sourceInformationContextSourceInformationContextOf = strMediaMetadataCompat != null ? sourceInformationContextOf(strMediaMetadataCompat, sourceInformationContext) : null;
        Object obj = getorbuildcacheddrawblock.read();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        onContentCardDismissed.RemoteActionCompatParcelizer(getorbuildcacheddrawblock.RemoteActionCompatParcelizer(), (Collection) arrayList);
        Iterator it = getorbuildcacheddrawblock.write().iterator();
        while (it.hasNext()) {
            arrayList2.add(getGroup((getOrBuildCachedDrawBlock) it.next(), sourceInformationContextSourceInformationContextOf));
        }
        boolean z = obj instanceof LayoutInfo;
        List<ModifierInfo> modifierInfo = z ? ((LayoutInfo) obj).getModifierInfo() : instance_delegatelambda0.write;
        if (z) {
            intRectBoundsOfLayoutNode = boundsOfLayoutNode((LayoutInfo) obj);
        } else if (arrayList2.isEmpty()) {
            intRectBoundsOfLayoutNode = emptyBox;
        } else {
            ArrayList arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((Group) it2.next()).getBox());
            }
            Iterator it3 = arrayList3.iterator();
            if (!it3.hasNext()) {
                IBraze$$ExternalSyntheticBUOutline0.m("Empty collection can't be reduced.");
                return null;
            }
            Object next = it3.next();
            while (it3.hasNext()) {
                next = union((IntRect) it3.next(), (IntRect) next);
            }
            intRectBoundsOfLayoutNode = (IntRect) next;
        }
        SourceLocation sourceLocationNextSourceLocation = (sourceInformationContextSourceInformationContextOf == null || !sourceInformationContextSourceInformationContextOf.isCall() || sourceInformationContext == null) ? null : sourceInformationContext.nextSourceLocation();
        if (obj != null) {
            return new NodeGroup(objIconCompatParcelizer, obj, intRectBoundsOfLayoutNode, arrayList, modifierInfo, arrayList2);
        }
        String name = sourceInformationContextSourceInformationContextOf != null ? sourceInformationContextSourceInformationContextOf.getName() : null;
        String name2 = sourceInformationContextSourceInformationContextOf != null ? sourceInformationContextSourceInformationContextOf.getName() : null;
        return new CallGroup(objIconCompatParcelizer, name, intRectBoundsOfLayoutNode, sourceLocationNextSourceLocation, (name2 == null || name2.length() == 0 || (intRectBoundsOfLayoutNode.getBottom() - intRectBoundsOfLayoutNode.getTop() <= 0 && intRectBoundsOfLayoutNode.getRight() - intRectBoundsOfLayoutNode.getLeft() <= 0)) ? null : getorbuildcacheddrawblock.serializer(), extractParameterInfo(arrayList, sourceInformationContextSourceInformationContextOf), arrayList, arrayList2, sourceInformationContextSourceInformationContextOf != null && sourceInformationContextSourceInformationContextOf.isInline());
    }

    public static final String getPosition(Group group) {
        return keyPosition(group.getKey());
    }

    @UiToolingDataApi
    private static final String keyPosition(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof JoinedKey)) {
            return null;
        }
        JoinedKey joinedKey = (JoinedKey) obj;
        String strKeyPosition = keyPosition(joinedKey.getLeft());
        return strKeyPosition == null ? keyPosition(joinedKey.getRight()) : strKeyPosition;
    }

    @UiToolingDataApi
    public static final <T> T mapTree(BlurredEdgeTreatmentCompanion blurredEdgeTreatmentCompanion, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, ContextCache contextCache) {
        getOrBuildCachedDrawBlock getorbuildcacheddrawblock = (getOrBuildCachedDrawBlock) onContentCardDismissed.serializer(blurredEdgeTreatmentCompanion.write());
        if (getorbuildcacheddrawblock == null) {
            return null;
        }
        CompositionCallStack compositionCallStack = new CompositionCallStack(new SlotTreeKt$$ExternalSyntheticLambda0(0, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry), contextCache.getContexts$ui_tooling_data(), null, 4, null);
        ArrayList arrayList = new ArrayList();
        compositionCallStack.convert(getorbuildcacheddrawblock, 0, arrayList);
        return (T) onContentCardDismissed.MediaMetadataCompat((List) arrayList);
    }

    public static final <T, R> T mapTreeWithStitching(BlurredEdgeTreatmentCompanion blurredEdgeTreatmentCompanion, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, ContextCache contextCache, Map<getOrBuildCachedDrawBlock, List<R>> map) {
        getOrBuildCachedDrawBlock getorbuildcacheddrawblock = (getOrBuildCachedDrawBlock) onContentCardDismissed.serializer(blurredEdgeTreatmentCompanion.write());
        if (getorbuildcacheddrawblock == null) {
            return null;
        }
        CompositionCallStack compositionCallStack = new CompositionCallStack(r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, contextCache.getContexts$ui_tooling_data(), map);
        ArrayList arrayList = new ArrayList();
        compositionCallStack.convert(getorbuildcacheddrawblock, 0, arrayList);
        return (T) onContentCardDismissed.MediaMetadataCompat((List) arrayList);
    }

    public static /* synthetic */ List findParameters$default(getOrBuildCachedDrawBlock getorbuildcacheddrawblock, ContextCache contextCache, int i, Object obj) {
        if ((i & 1) != 0) {
            contextCache = null;
        }
        return findParameters(getorbuildcacheddrawblock, contextCache);
    }

    public static /* synthetic */ SourceInformationContext sourceInformationContextOf$default(String str, SourceInformationContext sourceInformationContext, int i, Object obj) {
        if ((i & 2) != 0) {
            sourceInformationContext = null;
        }
        return sourceInformationContextOf(str, sourceInformationContext);
    }

    @UiToolingDataApi
    public static final List<ParameterInformation> findParameters(getOrBuildCachedDrawBlock getorbuildcacheddrawblock, ContextCache contextCache) {
        String strMediaMetadataCompat = getorbuildcacheddrawblock.MediaMetadataCompat();
        if (strMediaMetadataCompat == null) {
            return instance_delegatelambda0.write;
        }
        SourceInformationContext sourceInformationContextSourceInformationContextOf$default = null;
        if (contextCache == null) {
            sourceInformationContextSourceInformationContextOf$default = sourceInformationContextOf$default(strMediaMetadataCompat, null, 2, null);
        } else {
            Map<String, Object> contexts$ui_tooling_data = contextCache.getContexts$ui_tooling_data();
            Object objSourceInformationContextOf$default = contexts$ui_tooling_data.get(strMediaMetadataCompat);
            if (objSourceInformationContextOf$default == null) {
                objSourceInformationContextOf$default = sourceInformationContextOf$default(strMediaMetadataCompat, null, 2, null);
                contexts$ui_tooling_data.put(strMediaMetadataCompat, objSourceInformationContextOf$default);
            }
            if (objSourceInformationContextOf$default instanceof SourceInformationContext) {
                sourceInformationContextSourceInformationContextOf$default = (SourceInformationContext) objSourceInformationContextOf$default;
            }
        }
        ArrayList arrayList = new ArrayList();
        onContentCardDismissed.RemoteActionCompatParcelizer(getorbuildcacheddrawblock.RemoteActionCompatParcelizer(), (Collection) arrayList);
        return extractParameterInfo(arrayList, sourceInformationContextSourceInformationContextOf$default);
    }

    public static /* synthetic */ Object mapTree$default(BlurredEdgeTreatmentCompanion blurredEdgeTreatmentCompanion, r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, ContextCache contextCache, int i, Object obj) {
        if ((i & 2) != 0) {
            contextCache = new ContextCache();
        }
        return mapTree(blurredEdgeTreatmentCompanion, r8lambdafjq9b8d5osr_i2bajdxqnw6rnry, contextCache);
    }

    public static /* synthetic */ Object mapTreeWithStitching$default(BlurredEdgeTreatmentCompanion blurredEdgeTreatmentCompanion, r8lambdafbcCdPYn0HHVAiB8bD2sXm5Rsds r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, ContextCache contextCache, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            contextCache = new ContextCache();
        }
        if ((i & 4) != 0) {
            map = new LinkedHashMap();
        }
        return mapTreeWithStitching(blurredEdgeTreatmentCompanion, r8lambdafbccdpyn0hhvaib8bd2sxm5rsds, contextCache, map);
    }

    private static final SourceInformationContext sourceInformationContextOf(String str, SourceInformationContext sourceInformationContext) {
        String sourceFile;
        int i;
        CacheDrawModifierNodeImpl1 cacheDrawModifierNodeImpl1Write = SourceInformationKt.write(str);
        Integer numValueOf = null;
        if (cacheDrawModifierNodeImpl1Write == null) {
            return null;
        }
        String str2 = (String) cacheDrawModifierNodeImpl1Write.MediaMetadataCompat;
        String str3 = (String) cacheDrawModifierNodeImpl1Write.RemoteActionCompatParcelizer;
        if (str2 == null) {
            sourceFile = sourceInformationContext != null ? sourceInformationContext.getSourceFile() : null;
        } else {
            sourceFile = str2;
        }
        if (str2 != null) {
            String str4 = (String) cacheDrawModifierNodeImpl1Write.serializer;
            if (str4 != null) {
                numValueOf = setCarryoverInAppMessage.MediaSessionCompatQueueItem(36, str4);
            }
        } else if (sourceInformationContext != null) {
            numValueOf = Integer.valueOf(sourceInformationContext.getPackageHash());
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : -1;
        List list = (List) cacheDrawModifierNodeImpl1Write.IconCompatParcelizer;
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((CacheDrawModifierNode) it.next()).serializer) {
                i = i2;
                return new SourceInformationContext(str3, sourceFile, iIntValue, list, i, (List) cacheDrawModifierNodeImpl1Write.RatingCompat, cacheDrawModifierNodeImpl1Write.read, cacheDrawModifierNodeImpl1Write.write);
            }
            i2++;
        }
        i = -1;
        return new SourceInformationContext(str3, sourceFile, iIntValue, list, i, (List) cacheDrawModifierNodeImpl1Write.RatingCompat, cacheDrawModifierNodeImpl1Write.read, cacheDrawModifierNodeImpl1Write.write);
    }
}
