## Introduction ##

These instructions are for using [TunesRemote+](http://code.google.com/p/tunesremote-plus) with [MonkeyTunes for MediaMonkey](http://melloware.com/monkeytunes/)

![http://tunesremote-plus.googlecode.com/svn/wiki/monkeytunes-logo.png](http://tunesremote-plus.googlecode.com/svn/wiki/monkeytunes-logo.png)

## Server Installation ##

  1. Install the latest [MediaMonkey from Ventis Media](http://www.mediamonkey.com/).  Make sure at the end of the install to say **YES** when asked to run MediaMonkey.  This is important because the Installer runs as !Administrator and installs the COM SDK that MonkeyTunes uses.  If you don't say yes you will get COM errors in the MonkeyTunes log.
  1. Install the latest [MonkeyTunes](http://melloware.com/monkeytunes/) plugin for MediaMonkey from [Melloware](http://melloware.com/).
  1. Run MediaMonkey normally.  You will see a new MonkeyTunes treenode in your MediaMonkey like the following screenshot:

![http://tunesremote-plus.googlecode.com/svn/wiki/mt-connect.jpg](http://tunesremote-plus.googlecode.com/svn/wiki/mt-connect.jpg)

## Client Installation ##

  1. Look for TunesRemote+ in the !Android !Market and install it.
  1. Run the TunesRemote+ application on your Android device.
  1. Using !Bonjour it will try and discover your running MonkeyTunes.  Give it a few seconds...
  1. If it finds your MonkeyTunes click it then wait and in MediaMonkey you will see your device appear in the MonkeyTunes Treeview, simply click it and enter the 4 digit code!
  1. If MonkeyTunes does **NOT** automatically find your library click the Menu button on your !Android device and then choose "Manual"
  1. Enter the IP Address of your PC running MonkeyTunes (e.g. 192.168.1.100) and for Pairing Code enter "1" and it should connect immediately!  <font color='red'><b>IMPORTANT: Do NOT enter Pairing Code "0000" or "5309" only enter "1" or "0000000000000001".</b></font>

If you have trouble see our [MonkeyTunes Troubleshooting FAQ](http://forum.melloware.com/viewtopic.php?f=16&t=7703)