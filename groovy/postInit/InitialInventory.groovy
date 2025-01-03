// InitialInventory

player.testingStartingItems = false // Enable this to have the items be given every time you join the world. Use in testing only.
player.replaceDefaultInventory = false // Enable this to replace any existing items with GroovyScript's starting inventory items.

player.addStartingItem(item('minecraft:stone_sword'))
player.addStartingItem(item('minecraft:stone_pickaxe'))
player.addStartingItem(item('minecraft:stone_axe'))
player.addStartingItem(item('minecraft:stone_shovel'))

//player.addStartingItem(item('fruitphone:handheld', 1))

player.addStartingItem(item('akashictome:tome').withNbt([
	'akashictome:data': [
		'arcanearchives': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'arcanearchives:tome_arcana',
			'tag': [
				'akashictome:definedMod': 'arcanearchives',
				'Book': 'arcanearchives:xml/tome.xml'
			]
		],
		'bloodarsenal': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'guideapi:bloodarsenal-guide',
			'tag': [
				'akashictome:definedMod': 'bloodarsenal'
			]
		],
		'buildcraftlib': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'buildcraftlib:guide',
			'tag': [
				'akashictome:definedMod': 'buildcraftlib'
			]
		],
		'correlated': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'correlated:doc_tablet',
			'tag': [
				'akashictome:definedMod': 'correlated'
			]
		],
		'corvus': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'patchouli:guide_book',
			'tag': [
				'akashictome:definedMod': 'corvus',
				'patchouli:book': 'corvus:book'
			]
		],
		'crossroads': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'guideapi:crossroads-info_guide',
			'tag': [
				'akashictome:definedMod': 'crossroads'
			]
		],
		'elementaristics': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'patchouli:guide_book',
			'tag': [
				'akashictome:definedMod': 'elementaristics',
				'patchouli:book': 'elementaristics:liber_elementium'
			]
		],
		'embers': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'embers:codex',
			'tag': [
				'akashictome:definedMod': 'embers'
			]
		],
		'engineersdecor': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'patchouli:guide_book',
			'tag': [
				'akashictome:definedMod': 'engineersdecor',
				'patchouli:book': 'engineersdecor:engineersdecor_manual'
			]
		],
		'extrautils2': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'extrautils2:book',
			'tag': [
				'akashictome:definedMod': 'extrautils2'
			]
		],
		'forestry': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'forestry:book_forester',
			'tag': [
				'akashictome:definedMod': 'forestry'
			]
		],
		'mahoutsukai': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'mahoutsukai:guidebook',
			'tag': [
				'akashictome:definedMod': 'mahoutsukai'
			]
		],
		'matteroverdrive': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'matteroverdrive:data_pad',
			'tag': [
				'akashictome:definedMod': 'matteroverdrive'
			]
		],
		'naturesaura': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'patchouli:guide_book',
			'tag': [
				'akashictome:definedMod': 'naturesaura',
				'patchouli:book': 'naturesaura:book'
			]
		],
		'opencomputers': [
			'Count': 1 as byte,
			'Damage': 4 as short,
			'id': 'opencomputers:tool',
			'tag': [
				'akashictome:definedMod': 'opencomputers'
			]
		],
		'practicallogistics2': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'practicallogistics2:plguide',
			'tag': [
				'akashictome:definedMod': 'practicallogistics2'
			]
		],
		'quiverbow_restrung': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'patchouli:guide_book',
			'tag': [
				'akashictome:definedMod': 'quiverbow_restrung',
				'patchouli:book': 'quiverbow_restrung:weaponsmiths_journal'
			]
		],
		'rftools': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'rftools:rftools_manual',
			'tag': [
				'akashictome:definedMod': 'rftools'
			]
		],
		'rftools1': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'rftools:rftools_shape_manual',
			'tag': [
				'akashictome:definedMod': 'rftools1'
			]
		],
		'rftools2': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'rftoolsdim:rftoolsdim_manual',
			'tag': [
				'akashictome:definedMod': 'rftools2'
			]
		],
		'roots': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'roots:roots_guide',
			'tag': [
				'akashictome:definedMod': 'roots'
			]
		],
		'theaurorian': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'patchouli:guide_book',
			'tag': [
				'akashictome:definedMod': 'theaurorian',
				'patchouli:book': 'theaurorian:the_aurorian_guide'
			]
		],
		'thebetweenlands': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'thebetweenlands:manual_hl',
			'tag': [
				'akashictome:definedMod': 'thebetweenlands'
			]
		],
		'tis3d': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'tis3d:book_manual',
			'tag': [
				'akashictome:definedMod': 'tis3d'
			]
		],
		'twilightforest': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'patchouli:guide_book',
			'tag': [
				'akashictome:definedMod': 'twilightforest',
				'patchouli:book': 'twilightforest:guide'
			]
		],
		'wizardry': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'wizardry:book',
			'tag': [
				'akashictome:definedMod': 'wizardry'
			]
		],
		'woot': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'guideapi:woot-guide',
			'tag': [
				'akashictome:definedMod': 'woot'
			]
		],
		'xnet': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'xnet:xnet_manual',
			'tag': [
				'akashictome:definedMod': 'xnet'
			]
		]
	]
]))

player.addStartingItem(item('astralsorcery:itemjournal'))
player.addStartingItem(item('alquimia:lexicon'))
player.addStartingItem(item('botania:lexicon'))
player.addStartingItem(item('levelup2:skillbook'))

player.addStartingItem(item('minecraft:leather_helmet'))
player.addStartingItem(item('minecraft:leather_chestplate'))
player.addStartingItem(item('minecraft:leather_leggings'))
player.addStartingItem(item('minecraft:leather_boots'))
