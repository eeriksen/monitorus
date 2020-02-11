<script>
    import { createEventDispatcher } from 'svelte';

    const dispatch = createEventDispatcher();
</script>

<style src="./TopBar.scss"></style>

<div class="base">
    <div class="logo">
        Monitorus
    </div>
    <button on:click={() => dispatch('add')} class="add"></button>
</div>
