package com.mapbox.navigation.core.internal.dump;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import o.accessgetInstancedelegatecp;
import o.getCieXyz;
import o.hideCurrentlyDisplayingInAppMessage;
import o.isCurrentlyDisplayingInAppMessage;
import o.onContentCardDismissed;
import o.onViewAttachedToWindowlambda0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes2.dex */
public final class HelpDumpInterceptor {
    public final ArrayList availableCommands() {
        List listPlaybackStateCompat = onContentCardDismissed.PlaybackStateCompat((LinkedHashSet) MapboxDumpRegistry.delegate.serializer);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listPlaybackStateCompat) {
            int iWrite = getCieXyz.write();
            int iWrite2 = getCieXyz.write();
            int iWrite3 = getCieXyz.write();
            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(iWrite, 1803334089, -1803334089, getCieXyz.write(), iWrite2, new Object[]{(HelpDumpInterceptor) obj, this}, iWrite3)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(accessgetInstancedelegatecp.write(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((HelpDumpInterceptor) it.next()).getClass();
            arrayList2.add(new onViewAttachedToWindowlambda0("help:help", "Get the commands available from help"));
        }
        return arrayList2;
    }

    public final void intercept(FileDescriptor fileDescriptor, PrintWriter printWriter, List list) {
        list.getClass();
        if (list.isEmpty()) {
            StringBuilder sb = new StringBuilder("\nHello and welcome to the Mapbox Navigation dump! \n  This allows you to control Mapbox Navigation\n  from adb. Below are the commands and shortcuts\n  that are available. If you'd like to create your\n  own commands, look at the `MapboxDumpRegistry`.\n\nCommand arguments can be passed as key:value and are separated by spaces.\n  For example, if you pass data to dumpsys\n  and you have added a `MapboxDumpInterceptor`, your\n  interceptor will receive the command and the data.\n  \n  $ adb shell dumpsys activity service <service-package> turn_off_audio_guidance\n  >> turn_off_audio_guidance\n  \n  $ adb shell dumpsys activity service <service-package> months:june months:july\n  >> months:june months:july\n\n  $ adb shell dumpsys activity service <service-package> \"animal\":{\"age\":4,\"name\":\"cat\",\"weight\":{\"units\":\"kilograms\",\"value\":4.5}}\n  >> args[0] = animal:age:4\n  >> args[1] = animal:name:cat\n  >> args[2] = animal:weight:units:kilograms\n  >> args[3] = animal:weight:value:4.5\n  \n  Warning: json format may give unexpected results because arguments are split by spaces.\n  $ adb shell dumpsys activity service <service-package> \"name\":\"big cat\"\n  >> args[0] = name:big\n  >> args[1] = cat\n\nRequest help for the commands available. This list is given with the `help` command.\n");
            ArrayList arrayListAvailableCommands = availableCommands();
            String strLineSeparator = System.lineSeparator();
            strLineSeparator.getClass();
            sb.append(onContentCardDismissed.IconCompatParcelizer(arrayListAvailableCommands, strLineSeparator, null, null, new HelpDumpInterceptor$prettyString$1(0, this), 30));
            sb.append("\n            ");
            printWriter.println(isCurrentlyDisplayingInAppMessage.MediaSessionCompatQueueItem(sb.toString()));
            return;
        }
        if (list.size() == 1) {
            if (((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{list.get(0), "help"}, getCieXyz.write())).booleanValue()) {
                printWriter.println("Request help for the commands available");
                ArrayList arrayListAvailableCommands2 = availableCommands();
                String strLineSeparator2 = System.lineSeparator();
                strLineSeparator2.getClass();
                printWriter.println(onContentCardDismissed.IconCompatParcelizer(arrayListAvailableCommands2, strLineSeparator2, null, null, new HelpDumpInterceptor$prettyString$1(0, this), 30));
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ArrayList interceptors = MapboxDumpRegistry.getInterceptors(hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer(str, "help:", str));
            if (interceptors.isEmpty()) {
                printWriter.println("Could not find ".concat(str));
            } else {
                printWriter.println("Available commands for ".concat(str));
                Iterator it2 = interceptors.iterator();
                while (it2.hasNext()) {
                    for (onViewAttachedToWindowlambda0 onviewattachedtowindowlambda0 : ((HelpDumpInterceptor) it2.next()).availableCommands()) {
                        printWriter.println("   ".concat(((String) onviewattachedtowindowlambda0.serializer) + ", " + ((String) onviewattachedtowindowlambda0.write)));
                    }
                }
            }
        }
    }
}
