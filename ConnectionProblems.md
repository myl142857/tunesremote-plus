# Connection Problems FAQ #

If you are having trouble with TunesRemote+ connecting please follow this document for potential problems.


# Details #

## Firewall, Firewall, Firewall... ##

99.9% of problems connecting are related to your firewall.  Either in your Operating System firewall or in your router firewall.  I have had many users tell me "it's not my firewall I checked", and then after further debugging it turned out it was their firewall.

I beg you to read this Apple Support FAQ before saying its not your firewall:

http://support.apple.com/kb/TS1741

Still think its not your firewall?   Make sure the following Ports are allowed in all Virus Scanners, Firewalls, Spyware, Defenders etc.  Norton, Macafee, AVG, Avast, etc etc etc...

  * TCP 3689
  * TCP 1024
  * UDP 5353

## Mac OSX Firewall Rules ##

Make sure to **reboot** after installing iTunes or any other software or changing the firewall rules listed in the Apple Support link above.

## Win7 Firewall Rules ##

It comes down to 5 - yes, 5 - firewall rules on Win 7.  Note:  this config does not represent the most secure firewall config possible, because I'm opening ports to all apps, semi-indiscriminately.  But it works... and it allows me to access the pure goodness of TunesRemote+

1.) Launch Win 7 Firewall control panel snap-in; click on "Advanced Settings".

2.) Now, go to "Inbound Rules".  You will create two new Inbound Port rules:

Create an Inbound Port rule for UDP port 5353.  Full control to everyone...
Create an Inbound Port rule for TCP port 3689.  Full control to everyone...

3.) Then, go to "Outbound Rules".  You will create three:

Create an Outbound Port rule for UDP port 5353.  Full control to everyone...
Create an Outbound Port rule for TCP port 3689.  Same as above...
Create an Outbound Port rule for TCP port 1024.  Ditto...


That's it.  You're fine now... but if you're not...

4.) You DID forward ports in your router, correct?

First, forward TCP port 3689, then forward UDP port 5353.  This is pretty easy on Cisco / Linksys equipment...

## WIFI Connection ##

Another common problem is users don't realize their Android device needs to be on the **SAME** WIFI connection as their server.   Sometimes they are accidentally connected to a neighbor's WIFI network, sometimes they are accidentally using their Android 3G connection.

Also some routers do not allow your iTunes PC to be hardwired ethernet work with your WIFI connected mobile device.  Some routers by default block traffic between these two even though it is the same network on the same router.  Please see your router documentation on how to enabled sharing of Wired and Wireless connection traffic.

I will guarantee you will not get TunesRemote+ to work unless both the Android and Server app are on the same WIFI network.

## Pairing Two Devices To One iTunes ##

If you are having trouble pairing two devices to the same iTunes instance you need to go into iTunes settings and tell it to "Forget all remembered remotes".  Then perform the pairing operation again and it will fix your issue.

## TunesRemote vs TunesRemote+ ##

Some users have reported not being able to pair with iTunes using TunesRemote+ even though they could with the old TunesRemote.  A few users have reported success by uninstalling the old TunesRemote from their Android device.  Since TunesRemote+ is a fork of the original code there must be some conflict.