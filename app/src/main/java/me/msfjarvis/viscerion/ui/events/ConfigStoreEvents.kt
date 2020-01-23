/*
 * Copyright © 2017-2020 WireGuard LLC.
 * Copyright © 2018-2020 Harsh Shandilya <msfjarvis@gmail.com>. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0
 */
package me.msfjarvis.viscerion.ui.events

sealed class ConfigStoreEvents

class ConfigAdded(val name: String) : ConfigStoreEvents()
class ConfigRenamed(val newName: String) : ConfigStoreEvents()
object ConfigRemoved : ConfigStoreEvents()
