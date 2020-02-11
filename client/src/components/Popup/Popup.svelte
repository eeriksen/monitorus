<script>
    import { fade } from "svelte/transition"
    export let visible = false;
</script>

<style src="./Popup.scss"></style>

{#if visible}
    <div class="popup">
        <div class="box">
            <div class="title">
                <slot name="title">Title</slot>
            </div>
            <div class="content">
                <slot name="content">Content here...</slot>
            </div>
            <div class="actions">
                <slot name="actions">Actions</slot>
            </div>
        </div>
    </div>
{/if}
